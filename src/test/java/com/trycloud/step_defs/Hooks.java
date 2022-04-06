package com.trycloud.step_defs;


import com.trycloud.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit
   /* @Before (order = 1)
    public void setupScenario(){

    }

    @Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }*/

    @After
    public void teardownScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
       Driver.close();
    }

   /* @BeforeStep
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }*/


}
