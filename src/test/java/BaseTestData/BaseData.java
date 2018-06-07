package BaseTestData;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseData {

    /*Webdriver implementation*/

    protected WebDriver driver;

    /*URL implementation*/

    protected String LoginTestPageURL = "https://touch-test-central.azurewebsites.net/central/login";
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


    class Book {
        int id;
        String name, author, publisher;
        int quantity;

        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }
    }

    List<Book> list = new ArrayList<Book>();
    protected Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
    protected Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
    protected Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);


    protected String touchCentralActions = "Touch Central Actions";
    protected String hamburgerDashboardName = "Dashboard";
    protected String hamburgerUserProfile = "UserPage Profile";
    protected String hamburgerAboutTouch = "About Touch";
    protected String hamburgerLougout = "Logout";
    protected String hamburgerTouchpointForms = "TouchpointPage Forms";
    protected String hamburgerTouchpointDataLists = "TouchpointPage Data Lists";
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