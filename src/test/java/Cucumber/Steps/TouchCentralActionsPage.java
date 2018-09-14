package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.PendingException;
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

        Assert.assertEquals(base.driver.getCurrentUrl(), UKPAGE());

    }

    @Then("^The UK link is not visible$")
    public void theUKLinkIsNotVisible() {

        Assert.assertNotEquals(base.driver.getCurrentUrl(), UKPAGE());

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

    @Then("^I arrive on the Touchpoints result page$")
    public void iArriveOnTheTouchpointsResultPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), TOUCHPOINTSRESULTPAGE());

    }

    @And("^I give the searchable ([^\"]*) based on the ([^\"]*)$")
    public void iGiveTheSearchableKeyword(String keyword, String refID) {

        base.driver.findElement(By.cssSelector(refID)).sendKeys(keyword);

    }

    @And("^I click on the search button$")
    public void iClickOnTheSearchButton() {

        base.driver.findElement(By.className("btn-default")).click();

    }

    @And("^I give the ([^\"]*) as given name and ([^\"]*) as family name$")
    public void iGiveTheGiven_nameAsGivenNameAndFamily_nameAsFamilyName(String givenName, String familyName) {

        base.driver.findElement(By.id("given")).sendKeys(givenName);
        base.driver.findElement(By.id("family")).sendKeys(familyName);

    }

    @Then("^I don not move to the Touchpoints result page$")
    public void iDonNotMoveToTheTouchpointsResultPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(),UKPAGE());

    }
}
