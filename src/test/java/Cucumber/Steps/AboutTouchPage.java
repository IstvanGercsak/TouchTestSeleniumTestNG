package Cucumber.Steps;


import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AboutTouchPage extends BaseUtil {

    private BaseUtil base;

    public AboutTouchPage(BaseUtil base) {
        this.base = base;
    }

    @And("^I go on the \"([^\"]*)\" page$")
    public void iGoOnThePage(String page_name) {

        base.driver.findElement(By.id("hamburger-nav")).click();
        base.driver.findElement(By.xpath("//a[contains(text(),'" + page_name + "')]")).click();

    }

    @Then("^I arrive on the About page$")
    public void iArriveOnTheAboutPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), ABOUTPAGE);

    }

    @Then("^I see following ([^\"]*), ([^\"]*), ([^\"]*)$")
    public void iSeeFollowingTouchBuildVersionTouchBuildNumberTouchBuildTimestamp(String buildVersion, String buildNumber, String buildTimestamp) {

        Assert.assertEquals(base.driver.findElement(By.id("version")).getText(), buildVersion);
        Assert.assertEquals(base.driver.findElement(By.id("buildnumber")).getText(), buildNumber);
        Assert.assertEquals(base.driver.findElement(By.id("timestamp")).getText(), buildTimestamp);

    }
}
