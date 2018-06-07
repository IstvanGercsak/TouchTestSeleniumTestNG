package BaseTestData;

import org.openqa.selenium.WebDriver;

public class BaseData {

    /*Webdriver implementation*/

    protected WebDriver driver;

    /*URL implementation*/

    protected String TestLoginPageURL = "https://touch-test-central.azurewebsites.net/central/login";
    protected String DashboardPageURL = "https://touch-test-central.azurewebsites.net/central/reports/dashboard";
    protected String InvalidLoginPageURL = "https://touch-test-central.azurewebsites.net/central/login?error";
    protected String CentralPageURL = "https://touch-test-central.azurewebsites.net/central/";
    protected String UKPageURL = "http://touch-test-zone.azurewebsites.net/uk/";

    /*Hamburger menu names implementation*/

    protected String HamburgerDashboardName = "Dashboard";







    /*Users implementation*/

    protected String AdminUserName = "istvan.gercsak@metlife.com";
    protected String AdminUserPassword = "Igercsak8!#";
    protected String UKJurisdictionOperatorName = "istvan.gercsak@metlife.com";
    protected String UKJurisdictionOperatorPassword = "Igercsak8!#";




//    public HamburgerMenuPages HamburgerTouchCentralActions = new HamburgerMenuPages(
//            "Dashboard",
//            "https://touch-test-central.azurewebsites.net/central/"
//    );
//
//    public HamburgerMenuPages HamburgerUserProfile = new HamburgerMenuPages(
//            "User Profile",
//            "https://touch-test-central.azurewebsites.net/central/myprofile"
//    );
//
//    public HamburgerMenuPages HamburgerAboutTouch = new HamburgerMenuPages(
//            "About Touch",
//            "https://touch-test-central.azurewebsites.net/central/help/about"
//    );
//
//
//    public HamburgerMenuPages HamburgerLogout = new HamburgerMenuPages(
//            "Logout",
//            "https://touch-test-central.azurewebsites.net/central/login"
//    );
//
//
//    /*TOUCHPOINT ADMINISTRATION*/
//
//    sad Touchpoint Forms
//
//    Touchpoint Data Lists
//
//    /* SYSTEM ADMINISTRATION */
//
//    Manage Users
//
//    Manage Jurisdictions
//
//    base:tlbl:central:admin-system-endpoints-title
//
//    base:tlbl:central:admin-system-info-title
//
//
//
//    Text Content
//
//    Content Templates
//
//
//
//
//
//
//
//
//
//
//
//
//    public Sites LoginSite = new Sites(
//      ""
//    );
//
//    public Sites WorngLoginSite = new Sites(
//            ""
//    );
//
//    public Sites CentralSite = new Sites(
//            ""
//    );
//
//    public Sites UKSite = new Sites(
//            ""
//    );
//
//    public Sites DashbordSite = new Sites(
//            ""


}
