package BaseTestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class BaseData {

    /*Webdriver implementation*/

    protected WebDriver driver;

    /*URL implementation*/

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

        Page(String hamburgerName, String url) {

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

    /*Placeholder implementation*/

    public class Placeholder {

        String cssSelector;
        String placeholder;

        Placeholder(String cssSelectorName, String placeholderName) {
            this.cssSelector = cssSelectorName;
            this.placeholder = placeholderName;
        }

        public String cssSelector() {
            return cssSelector;
        }

        public String placeholder() {
            return placeholder;
        }

    }

    protected final Placeholder PLACEHOLDERUSERNAME = new Placeholder(
            "#username",
            "Username / Email"
    );

    protected final Placeholder PLACEHOLDERPASSWORD = new Placeholder(
            "#password",
            "Password"
    );

    protected final Placeholder PLACEHOLDERSEARCH = new Placeholder(
            "#reference",
            "Search for name or reference"
    );

    protected Page aboutTouchPage = new Page(
            "About Touch",
            "https://touch-test-central.azurewebsites.net/central/help/about"
    );

    protected Page logoutPage = new Page(
            "Logout",
            ""
    );

    protected Page dashboardPage = new Page(
            "Dashboard",
            "https://touch-test-central.azurewebsites.net/central/reports/dashboard"
    );

    protected Page userProfilePage = new Page(
            "User Profile",
            "https://touch-test-central.azurewebsites.net/central/myprofile"
    );

    protected Page touchCentral = new Page(
            "Touch Central Actions",
            "https://touch-test-central.azurewebsites.net/central/"
    );

    protected Page uktouchPage = new Page(
            "uk:tlbl:zone:touchpoints-title",
            "http://touch-test-zone.azurewebsites.net/uk/"
    );

    protected Page wrongLoginPage = new Page(
            "",
            "https://touch-test-central.azurewebsites.net/central/login?error"
    );

    protected Page loginPage = new Page(
            "",
            "https://touch-test-central.azurewebsites.net/central/login"
    );


//    protected String hamburgerTouchpointForms = "TouchpointPage Forms";
//    protected String hamburgerTouchpointDataLists = "TouchpointPage Data Lists";
//    protected String hamburgerManageUsers = "Manage Users";
//    protected String hamburgerManageJurisdictions = "Manage Jurisdictions";
//    protected String hamburgerAdmin_system_endpoints_title = "base:tlbl:central:admin-system-endpoints-title";
//    protected String hamburgerAdmin_system_info_title = "base:tlbl:central:admin-system-info-title";
//    protected String hamburgerTextContent = "Text Content";
//    protected String hamburgerContentTemplates = "Content Templates";

    /*Users implementation*/

    protected String adminUserName = "TestAdmin@TestAdmin.com";
    protected String adminUserPassword = "Igercsak8!#";
    protected String ukJurisdictionOperatorName = "istvan.gercsak@gmail.com";
    protected String ukJurisdictionOperatorPassword = "Igercsak8!#";
    protected String testUserName = "istvan.gercsak@metlife.com";
    protected String testUserPassword = "Igercsak8!#";


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

    protected void login(String testUserName, String testUserPassword) {

        driver.findElement(By.id("username")).sendKeys(testUserName);
        driver.findElement(By.id("password")).sendKeys(testUserPassword);
        driver.findElement(By.className("btn-primary")).click();

    }

    private ArrayList<String> createHamburgerMenuList() {

        ArrayList<String> myList = new ArrayList<>();

        //ToDo:This Menu element is not appears on every page
        //myList.add(uktouchPage.hamburgerName);
        myList.add(touchCentral.hamburgerName);
        myList.add(dashboardPage.hamburgerName);
        myList.add(userProfilePage.hamburgerName);
        myList.add(logoutPage.hamburgerName);
        myList.add(aboutTouchPage.hamburgerName);

        return myList;
    }

    protected void hamburgerMenuElementsIsClickable() {

        for (String item : createHamburgerMenuList()) {
            driver.findElement(By.xpath("//a[contains(text(),'" + item + "')]"));
        }

    }

    protected void clickOnProfileIcon() {

        driver.findElement(By.className("icon-medium")).click();

    }

    protected void assertBreadcrumbs(String getBreadcumbs) {

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"titlebarFragment\"]/div/span")).getText(), getBreadcumbs);

    }

    protected void urlIsAssert(String checkPage) {

        Assert.assertEquals(driver.getCurrentUrl(), checkPage);

    }

    protected void assertTextOn(String getPermissionText, boolean isAvailable) {

        Assert.assertEquals(driver.getPageSource().contains(getPermissionText), isAvailable);

    }

    protected void clickOnTextLink(String linkText) {

        driver.findElement(By.linkText(linkText)).click();

    }

    protected void hamburgerLogout() {

        directionWithHamburgerMenu(logoutPage.hamburgerName);

    }

    protected void assertPlaceholder(Placeholder placeholder) {

        Assert.assertEquals(driver.findElement(By.cssSelector(placeholder.cssSelector())).getAttribute("placeholder"), placeholder.placeholder);

    }
}