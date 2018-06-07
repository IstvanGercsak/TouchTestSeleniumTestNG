package BaseTestData;

import org.openqa.selenium.WebDriver;

public class BaseData {

    /*Webdriver implementation*/

    protected WebDriver driver;

    /*URL implementation*/

    protected String testLoginPageURL = "https://touch-test-central.azurewebsites.net/central/login";
    protected String invalidLoginPageURL = "https://touch-test-central.azurewebsites.net/central/login?error";
    protected String centralPageURL = "https://touch-test-central.azurewebsites.net/central/";
    protected String ukPageURL = "http://touch-test-zone.azurewebsites.net/uk/";
    protected String dashboardPageURL = "https://touch-test-central.azurewebsites.net/central/reports/dashboard";
    protected String userProfileURL = "https://touch-test-central.azurewebsites.net/central/myprofile";
    protected String aboutTouchURL = "https://touch-test-central.azurewebsites.net/central/help/about";
    protected String touchpointFormsURL = "https://touch-test-central.azurewebsites.net/central/admin/touchpoint/forms";
    protected String touchpointDataListsURL = "https://touch-test-central.azurewebsites.net/central/admin/touchpoint/datalists";
    protected String manageUsersURL = "https://touch-test-central.azurewebsites.net/central/admin/system/users";
    protected String manageJurisdictionsURL = "https://touch-test-central.azurewebsites.net/central/admin/system/jurisdictions";
    protected String admin_system_endpoints_titleURL = "https://touch-test-central.azurewebsites.net/central/admin/system/endpoints";
    protected String admin_system_info_titleURL = "https://touch-test-central.azurewebsites.net/central/admin/system/info";
    protected String textContentURL = "https://touch-test-central.azurewebsites.net/central/admin/content/text";
    protected String contentTemplatesURL = "https://touch-test-central.azurewebsites.net/central/admin/content/templates";

    /*Hamburger menu names implementation*/

    protected String touchCentralActions = "Touch Central Actions";
    protected String hamburgerDashboardName = "Dashboard";
    protected String hamburgerUserProfile = "User Profile";
    protected String hamburgerAboutTouch = "About Touch";
    protected String hamburgerLougout = "Logout";
    protected String hamburgerTouchpointForms = "Touchpoint Forms";
    protected String hamburgerTouchpointDataLists = "Touchpoint Data Lists";
    protected String hamburgerManageUsers = "Manage Users";
    protected String hamburgerManageJurisdictions = "Manage Jurisdictions";
    protected String hamburgerAdmin_system_endpoints_title = "base:tlbl:central:admin-system-endpoints-title";
    protected String hamburgerAdmin_system_info_title = "base:tlbl:central:admin-system-info-title";
    protected String hamburgerTextContent = "Text Content";
    protected String hamburgerContentTemplates = "Content Templates";

    /*Users implementation*/

    protected String adminUserName = "istvan.gercsak@metlife.com";
    protected String adminUserPassword = "Igercsak8!#";
    protected String ukJurisdictionOperatorName = "istvan.gercsak@metlife.com";
    protected String ukJurisdictionOperatorPassword = "Igercsak8!#";

}