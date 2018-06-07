package UserPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightsTest extends RightsTestDriver {


    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(LoginTestPageURL);

    }

    @Test(description = "Login with admin")
    public void loginWithAdmin() {
        login(adminUserName, adminUserPassword);
    }

    @Test(description = "Login with TouchpointPage administrator")
    public void loginWithTouchpointUser() {
        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
    }


    @Test(description = "I can reach every page with admin permission - (Regression and Smoke)")
    public void reachPagesWithAdmin() {

        login(adminUserName, adminUserPassword);
        clickOnTheHamburgeMenuDropdown();
        clickOnTheHamburgerMenuElement(hamburgerDashboardName);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerTouchCentralActions);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerUserProfile);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerAboutTouch);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerLogout);


    }

    @Test(description = "I can reach every page with admin permission")
    public void reachPagesWithTouchUser() {
        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}


