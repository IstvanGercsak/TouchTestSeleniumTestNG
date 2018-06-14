package Cucumber.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/Cucumber/Features"},
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "Cucumber/Features/Steps")

public class TestRunner extends AbstractTestNGCucumberTests {


}
