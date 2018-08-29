package Cucumber.Steps;

import Cucumber.Base.BaseUtil;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {

        base.driver.navigate().to(LOGINPAGE());

    }

    @And("^I log into the Touch with ([^\"]*) username and ([^\"]*) password$")
    public void iLogIntoTheTouchWithUsernameAndPasswordOutline(String username, String password) {

        base.driver.findElement(By.id(userNameID())).sendKeys(username);
        base.driver.findElement(By.id(passwordID())).sendKeys(password);

    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {

        base.driver.findElement(By.className(loginButtonClass())).click();

    }

    @Then("^I arrive on the central page$")
    public void iArriveOnTheCentralPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), CENTRALPAGEURL());

    }

    @Then("^I redirected to the invalid login page$")
    public void iRedirectedToTheInvalidLoginPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), INVALIDLOGINPAGE());

    }

    @Given("^I log into the Touch with \"([^\"]*)\" username and \"([^\"]*)\" password$")
    public void iLogIntoTheTouchWithUsernameAndPasswordSingle(String username, String password) {

        base.driver.findElement(By.id(userNameID())).sendKeys(username);
        base.driver.findElement(By.id(passwordID())).sendKeys(password);

    }

    @Then("^I can see the \"([^\"]*)\" placeholder in the username and the \"([^\"]*)\" placeholder for the password field$")
    public void iCanSeeThePlaceholderInTheUsernameAndThePlaceholderForThePasswordField(String usernamePlaceholder, String passwordPlaceholder) {

        Assert.assertEquals(base.driver.findElement(By.cssSelector(userNameCSS())).getAttribute("placeholder"), usernamePlaceholder);
        Assert.assertEquals(base.driver.findElement(By.cssSelector(passwordCSS())).getAttribute("placeholder"), passwordPlaceholder);

    }
}