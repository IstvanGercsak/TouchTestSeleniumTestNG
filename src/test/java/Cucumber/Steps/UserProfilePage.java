package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UserProfilePage extends BaseUtil {

    private BaseUtil base;

    public UserProfilePage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the user Profile page$")
    public void iArriveOnTheUserProfilePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), USERPROFILEPAGE);

    }

    @And("^I click on the profile icon$")
    public void iClickOnTheProfileIcon() {

        base.driver.findElement(By.className(profileIconClass)).click();

    }

    @And("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String buttonName) {

        base.driver.findElement(By.linkText(buttonName)).click();

    }

    @Then("^The ([^\"]*) is ([^\"]*)$")
    public void iCanSeeTheRightRights(String right, boolean isAvailable) {

        Assert.assertEquals(base.driver.getPageSource().contains(right), isAvailable);

    }
}
