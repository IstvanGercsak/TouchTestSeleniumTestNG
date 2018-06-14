package Cucumber.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/Cucumber/Features"}, glue = "Cucumber/Features/Steps")
public class TestRunner extends AbstractTestNGCucumberTests {


}
