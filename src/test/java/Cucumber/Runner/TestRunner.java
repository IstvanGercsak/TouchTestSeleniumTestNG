package Cucumber.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/java/Cucumber/Features"}, glue = "src/test/java/Cucumber/Steps")
public class TestRunner extends AbstractTestNGCucumberTests {


}
