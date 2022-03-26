package com.trycloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
   Creating a private constructor, so we are closing
   access to the object of this class from outside the class
    */
    public Driver() {
    }

    /*
    we make webdriver private. because we want to close access from outside the class
    we make it static because we will use it in a static method.
     */
   // private static WebDriver driver;


    private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            /*
            we read our browserType from configuration.properties.
            This way, we can control which browser is open from outside code,
            from  configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }
        return driverPool.get();
    }

    public static void close() {
        driverPool.get().close();
        driverPool.set(null);   // we destroy the driver object after quit operation
        //driverPool.remove();
    }


}
