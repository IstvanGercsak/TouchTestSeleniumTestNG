package Cucumber.Steps;

import Cucumber.Base.BaseUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginStep extends BaseUtil {

    public class User {

        String username, password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    private static final String CENTRALPAGEURL = "https://touch-test-central.azurewebsites.net/central/";
    private static final String INVALIDLOGINPAGE = "https://touch-test-central.azurewebsites.net/central/login?error";
    private static final String PROFILEPAGE = "https://touch-test-central.azurewebsites.net/central/myprofile";
    private static final String LOGINPAGE = "https://touch-test-central.azurewebsites.net/central/login";

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {

        base.driver.navigate().to("https://touch-test-central.azurewebsites.net/central/login");

    }

    @And("^I log into the Touch with ([^\"]*) and ([^\"]*)$")
    public void iLogIntoTheTouchWithUsernameAndPasswordOutline(String username, String password) {

        base.driver.findElement(By.name("username")).sendKeys(username);
        base.driver.findElement(By.name("password")).sendKeys(password);

    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {

        base.driver.findElement(By.className("btn-primary")).click();

    }

    @Then("^I arrive on the central page$")
    public void iArriveOnTheCentralPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), CENTRALPAGEURL);

    }

    @Then("^I redirected to the invalid login page$")
    public void iRedirectedToTheInvalidLoginPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), INVALIDLOGINPAGE);

    }

    @And("^I click on the profile icon$")
    public void iClickOnTheProfileIcon() {

        base.driver.findElement(By.className("icon-medium")).click();

    }

    @Then("^I arrive on the profile page$")
    public void iArriveOnTheProfilePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), PROFILEPAGE);

    }

    @Given("^I log into the Touch with \"([^\"]*)\" username and \"([^\"]*)\" password$")
    public void iLogIntoTheTouchWithUsernameAndPasswordSingle(String username, String password) {

        base.driver.findElement(By.name("username")).sendKeys(username);
        base.driver.findElement(By.name("password")).sendKeys(password);

    }

    @And("^I click on the Metlife icon$")
    public void iClickOnTheMetlifeIcon() {

        base.driver.findElement(By.className("img-responsive")).click();

    }

    @Then("^I arrive on the Metlife page$")
    public void iArriveOnTheMetlifePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), CENTRALPAGEURL);

    }

    @Then("^The \"([^\"]*)\" breadcrumb appears$")
    public void theRightBreadcrumbAppears(String breadcumb) {

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"titlebarFragment\"]/div/span")).getText(), breadcumb);

    }

    @And("^I click on the log out$")
    public void iClickOnTheLogOut() {

        driver.findElement(By.id("hamburger-nav")).click();
        driver.findElement(By.xpath("//a[contains(text(),'" + "Logout" + "')]")).click();

    }

    @Then("^I redirected to the login page$")
    public void iRedirectedToTheLoginPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(),"LOGINPAGE");

    }

}