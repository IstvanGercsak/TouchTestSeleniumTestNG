package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class TouchCentralActionsPage extends BaseUtil {

    private BaseUtil base;

    public TouchCentralActionsPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Touch Central Page$")
    public void iArriveOnTheTouchCentralPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), UKPAGE);

    }

    @Then("^The UK link is not visible$")
    public void theUKLinkNotVisible() {

        Assert.assertNotEquals(base.driver.getCurrentUrl(), UKPAGE);

    }

    @Given("^I go on the UK page$")
    public void iGoOnTheUKPage() {

        CentralPage cp = new CentralPage(base);

        cp.iLogIntoTheApplicationWithJurisdiction();
        cp.iClickOnTheOptions("UK");

    }

    @And("^I choose the ([^\"]*)$")
    public void iChoseSearchby(String getMode) {

        WebElement mySelectElement = base.driver.findElement(By.tagName("select"));

        Select dropdown = new Select(mySelectElement);
        base.driver.findElement(By.tagName("select")).click();

        dropdown.selectByVisibleText(getMode);
        base.driver.findElement(By.tagName("select")).click();

    }

    @Then("^I see the right ([^\"]*) based on ([^\"]*) selector$")
    public void iSeeTheRightPlaceholder_(String placeholder, String selector) {

        Assert.assertEquals(base.driver.findElement(By.cssSelector(selector)).getAttribute("placeholder"), placeholder);

    }
}
