package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @And("^I click on the \"([^\"]*)\" option$")
    public void iClickOnTheOptions(String getOption) {

        try {
            base.driver.findElement(By.linkText(getOption)).click();
        } catch (NoSuchElementException e) {
            System.out.println("You have no rights");
        }

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

    @Given("^I log into the application with Jurisdiction user$")
    public void iLogIntoTheApplicationWithJurisdiction() {

        base.driver.navigate().to("https://touch-test-central.azurewebsites.net/central/login");
        base.driver.findElement(By.id("username")).sendKeys(ukJurisdictionOperatorName);
        base.driver.findElement(By.id("password")).sendKeys(ukJurisdictionOperatorPassword);
        base.driver.findElement(By.className("btn-primary")).click();

    }

    @Given("^I log into the application with Admin user$")
    public void iLogIntoTheApplicationWithAdmin() {

        base.driver.navigate().to("https://touch-test-central.azurewebsites.net/central/login");
        base.driver.findElement(By.id("username")).sendKeys(adminName);
        base.driver.findElement(By.id("password")).sendKeys(adminPassword);
        base.driver.findElement(By.className("btn-primary")).click();

    }

    @Given("^I log into the application with Mixed rights user$")
    public void iLogIntoTheApplicationWithMixed() {

        base.driver.navigate().to("https://touch-test-central.azurewebsites.net/central/login");
        base.driver.findElement(By.id("username")).sendKeys(mixedUserName);
        base.driver.findElement(By.id("password")).sendKeys(mixedUserPassword);
        base.driver.findElement(By.className("btn-primary")).click();

    }

    @And("^I click on the profile icon$")
    public void iClickOnTheProfileIcon() {

        base.driver.findElement(By.className("icon-medium")).click();

    }

    @And("^I navigate with the hamburger menu to the ([^\"]*) page$")
    public void iNavigateWithTheHamburgerMenuToTheSitePage(String siteName) {

        base.driver.findElement(By.id("hamburger-nav")).click();
        base.driver.findElement(By.linkText(siteName)).click();

    }

    @Then("^I get \"([^\"]*)\" error message$")
    public void iGetErrorMessage(String getErrorMessage) {

        Assert.assertEquals(base.driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div/div/div/div/p[2]/span")).getText(), getErrorMessage);

    }

    @Then("^I can see the right ([^\"]*) that is belong to the page$")
    public void iArriveToTheBreadcrumbsPage(String siteBreadcrumbs) {

        Assert.assertEquals(base.driver.findElement(By.className("page-bar-title")).getText(), siteBreadcrumbs);

    }
}