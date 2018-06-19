package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CentralPage extends BaseUtil {

    private BaseUtil base;

    public CentralPage(BaseUtil base) {
        this.base = base;
    }


    @Then("^I redirected to the UK page$")
    public void iRedirectedToTheUKPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), UKPAGE);

    }

    @Then("^I redirected to the Dashboard page$")
    public void iRedirectedToTheDashboardPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), DASHBOARDPAGE);

    }

    @And("^I click on the \"([^\"]*)\" options$")
    public void iClickOnTheOptions(String getOption) {

        driver.findElement(By.linkText(getOption)).click();

    }

    @Then("^I redirected to the login page$")
    public void iRedirectedToTheLoginPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), LOGINPAGE);

    }

    @Then("^I arrive on the Metlife page$")
    public void iArriveOnTheMetlifePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), CENTRALPAGEURL);

    }

    @Then("^The \"([^\"]*)\" breadcrumb appears$")
    public void theRightBreadcrumbAppears(String breadcumb) {

        Assert.assertEquals(base.driver.findElement(By.xpath("//*[@id=\"titlebarFragment\"]/div/span")).getText(), breadcumb);

    }

    @And("^I click on the log out$")
    public void iClickOnTheLogOut() {

        base.driver.findElement(By.id("hamburger-nav")).click();
        base.driver.findElement(By.xpath("//a[contains(text(),'" + "Logout" + "')]")).click();

    }

    @And("^I click on the Metlife icon$")
    public void iClickOnTheMetlifeIcon() {

        base.driver.findElement(By.className("img-responsive")).click();

    }

    @Then("^I arrive on the profile page$")
    public void iArriveOnTheProfilePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), PROFILEPAGE);

    }

    @Given("^I log into the application$")
    public void iLogIntoTheApplication() {

        base.driver.navigate().to("https://touch-test-central.azurewebsites.net/central/login");
        base.driver.findElement(By.id("username")).sendKeys(ukJurisdictionOperatorName);
        base.driver.findElement(By.id("password")).sendKeys(ukJurisdictionOperatorPassword);
        base.driver.findElement(By.className("btn-primary")).click();

    }

    @And("^I click on the profile icon$")
    public void iClickOnTheProfileIcon() {

        base.driver.findElement(By.className("icon-medium")).click();

    }
}