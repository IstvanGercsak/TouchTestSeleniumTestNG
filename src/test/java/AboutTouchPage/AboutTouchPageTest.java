package AboutTouchPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutTouchPageTest extends AboutTouchPageTestDriver {

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginPage.url());

    }

    @Test
    public void pageIsAvailable() {

        login(adminUserName,adminUserPassword);
        goToHamburgerAboutTouchPage();
        Assert.assertEquals(driver.getCurrentUrl(), aboutTouchPage.url());

    }

    @Test
    public void AboutTouchHamburgerMenuElementsAreAvailable() {

        goToHamburgerAboutTouchPage();
        clickOnHamburgermenu();

    }

    @Test
    public void AboutTouchMetlifeIcondirection() {

        goToHamburgerAboutTouchPage();
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(),touchCentral.url());

    }

    @Test
    public void AboutTouchBreadcrumbs() {

        goToHamburgerAboutTouchPage();
        checkHamburgerMenuList();
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
