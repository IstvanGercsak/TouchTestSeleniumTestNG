package Cucumber.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /* Page object MUST be separate from Step definitions */

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void Login(String userName, String password) {

        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);

    }

    public void clickLogin() {

        btnLogin.submit();

    }

}