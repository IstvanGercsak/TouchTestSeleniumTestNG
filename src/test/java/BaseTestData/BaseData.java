package BaseTestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BaseData {

    /*Webdriver implementation*/

    protected WebDriver driver;

    /*URL implementation*/

    //protected String LoginTestPageURL = "https://touch-test-central.azurewebsites.net/central/login";
    //protected String invalidLoginPageURL = "https://touch-test-central.azurewebsites.net/central/login?error";
    //protected String centralPageURL = "https://touch-test-central.azurewebsites.net/central/";
    //protected String ukPageURL = "http://touch-test-zone.azurewebsites.net/uk/";
    //protected String dashboardPageURL = "https://touch-test-central.azurewebsites.net/central/reports/dashboard";
    //protected String userProfileURL = "https://touch-test-central.azurewebsites.net/central/myprofile";
    //protected String aboutTouchURL = "https://touch-test-central.azurewebsites.net/central/help/about";

//    protected String touchpointFormsURL = "https://touch-test-central.azurewebsites.net/central/admin/touchpoint/forms";
//    protected String touchpointDataListsURL = "https://touch-test-central.azurewebsites.net/central/admin/touchpoint/datalists";
//    protected String manageUsersURL = "https://touch-test-central.azurewebsites.net/central/admin/system/users";
//    protected String manageJurisdictionsURL = "https://touch-test-central.azurewebsites.net/central/admin/system/jurisdictions";
//    protected String admin_system_endpoints_titleURL = "https://touch-test-central.azurewebsites.net/central/admin/system/endpoints";
//    protected String admin_system_info_titleURL = "https://touch-test-central.azurewebsites.net/central/admin/system/info";
//    protected String textContentURL = "https://touch-test-central.azurewebsites.net/central/admin/content/text";
//    protected String contentTemplatesURL = "https://touch-test-central.azurewebsites.net/central/admin/content/templates";

    /*Hamburger menu names implementation*/

    public class Page {

        String hamburgerName, url;

        public Page(String hamburgerName, String url) {

            this.hamburgerName = hamburgerName;
            this.url = url;

        }

        public String hamburgerName() {
            return hamburgerName;
        }

        public String url() {
            return url;
        }

    }

    public List<Page> listOfPages = new ArrayList<Page>();

    public Page aboutTouchPage = new Page(
            "About Touch",
            "https://touch-test-central.azurewebsites.net/central/help/about"
    );

    public Page logoutPage = new Page(
            "Logout",
            ""
    );

    public Page dashboardPage = new Page(
            "Dashboard",
            "https://touch-test-central.azurewebsites.net/central/reports/dashboard"
    );

    public Page userProfilePage = new Page(
            "User Profile",
            ""
    );

    public Page touchCentral = new Page(
            "Touch Central Actions",
            "https://touch-test-central.azurewebsites.net/central/"
    );

    public Page uktouchPage = new Page(
            "",
            "http://touch-test-zone.azurewebsites.net/uk/"
    );

    public Page wrongLoginPage = new Page(
            "",
            "https://touch-test-central.azurewebsites.net/central/login?error"
    );

    public Page loginPage = new Page(
            "",
            "    https://touch-test-central.azurewebsites.net/central/login"
    );


    //protected String touchCentralActions = "Touch Central Actions";
    //protected String hamburgerDashboardName = "Dashboard";
    //protected String hamburgerUserProfile = "User Profile";
    //protected String hamburgerAboutTouch = "About Touch";
    //protected String hamburgerLougout = "Logout";


//    protected String hamburgerTouchpointForms = "TouchpointPage Forms";
//    protected String hamburgerTouchpointDataLists = "TouchpointPage Data Lists";
//    protected String hamburgerManageUsers = "Manage Users";
//    protected String hamburgerManageJurisdictions = "Manage Jurisdictions";
//    protected String hamburgerAdmin_system_endpoints_title = "base:tlbl:central:admin-system-endpoints-title";
//    protected String hamburgerAdmin_system_info_title = "base:tlbl:central:admin-system-info-title";
//    protected String hamburgerTextContent = "Text Content";
//    protected String hamburgerContentTemplates = "Content Templates";

    /*Users implementation*/

    protected String adminUserName = "istvan.gercsak@metlife.com";
    protected String adminUserPassword = "Igercsak8!#";
    protected String ukJurisdictionOperatorName = "istvan.gercsak@metlife.com";
    protected String ukJurisdictionOperatorPassword = "Igercsak8!#";

    /*Used methods on every page*/

    protected void clickOnTheMetlifeIcon() {

        driver.findElement(By.className("img-responsive")).click();

    }

    protected void clickOnHamburgermenu() {

        driver.findElement(By.id("hamburger-nav")).click();

    }

    protected void directionWithHamburgerMenu(String getHamburgerMenuName) {

        clickOnHamburgermenu();
        driver.findElement(By.xpath("//a[contains(text(),'" + getHamburgerMenuName + "')]")).click();

    }

    public void login(String TESTUSERNAME, String TESTPASSWORD) {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();

    }

    public void checkHamburgerMenuList() {

        clickOnHamburgermenu();


    }

}