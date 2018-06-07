package LoginPageTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends LoginPageTestDriver {

    //Todo: webserveren beallitani az instance-ot
    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testLoginPageURL);

    }

    @Test(description = "Touch is available!")
    public void touchIsAvailable() {

        urlIsAssert(testLoginPageURL);

    }


    @Test(description = "I can log into the application")
    public void loginIntoTouch() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        urlIsAssert(centralPageURL);

    }

    @Test(description = "I don't give username or password")
    public void redirectedToInvalidLoginPage() {

        login("", "");
        Assert.assertEquals(driver.getCurrentUrl(), invalidLoginPageURL);

    }

    @Test(description = "I don't give username or passwowrd and a message appears")
    public void messageApperAfterWrongLoginDetails() {

        login("", "");
        findInvalidMessage();

    }

    @Test(description = "Log in after wrong username or password")
    public void loginAfterWrongdetails() {

        login("", "");
        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        urlIsAssert(centralPageURL);

    }

    @Test(description = "Hamburger menu is availible")
    public void hamburgerMenuisAvailable() {

    }

    @Test(description = "Hamburger menu is availible")
    public void hamburgerMenuListIsAvailable() {

    }




    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
