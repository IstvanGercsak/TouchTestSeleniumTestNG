package SeleniumTestNG.BaseData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class BaseData {

    /*Webdriver implementation*/

    protected WebDriver driver;

    /*Hamburger menu names implementation*/

    public class Page {

        String hamburgerName, url, breadcrumb;

        Page(String hamburgerName, String url, String breadcrumb) {

            this.hamburgerName = hamburgerName;
            this.url = url;
            this.breadcrumb = breadcrumb;

        }

        public String hamburgerName() {
            return hamburgerName;
        }

        public String url() {
            return url;
        }

        public String breadcrumb() {
            return breadcrumb;
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

    protected final Placeholder placeholderUserName = new Placeholder(
            "#username",
            "Username / Email"
    );

    protected final Placeholder placeholderPassword = new Placeholder(
            "#password",
            "Password"
    );

    protected final Placeholder placeholderReference = new Placeholder(
            "#reference",
            "Search for name or reference"
    );

    protected final Placeholder placeholderGivenName = new Placeholder(
            "#given",
            "uk:tlbl:zone:searchbar-search-given-name"
    );

    protected final Placeholder placeholderFamilyName = new Placeholder(
            "#family",
            "uk:tlbl:zone:searchbar-search-family-name"
    );

    protected final Placeholder placeholderEmail = new Placeholder(
            "#email",
            "uk:tlbl:zone:searchbar-search-email"
    );

    protected Page aboutTouchPage = new Page(
            "About Touch",
            "",
            "About Touch"
    );

    protected Page logoutPage = new Page(
            "Logout",
            "",
            ""
    );

    protected Page dashboardPage = new Page(
            "Dashboard",
            "",
            "Dashboards"
    );

    protected Page userProfilePage = new Page(
            "User Profile",
            "",
            "User Profile"
    );

    protected Page touchCentral = new Page(
            "Touch Central Actions",
            "",
            "Touch Central"
    );

    protected Page uktouchPage = new Page(
            "uk:tlbl:zone:touchpoints-title",
            "",
            "uk:tlbl:zone:touchpoints-title"
    );

    protected Page wrongLoginPage = new Page(
            "",
            "",
            ""
    );

    protected Page loginPage = new Page(
            "",
            "",
            ""
    );

    protected Page TouchpointFormsPage = new Page(
            "Touchpoint Forms",
            "",
            "Touchpoint Forms"
    );


    protected Page TouchpointDataListsPage = new Page(
            "Touchpoint Data Lists",
            "",
            "Touchpoint Data Lists"
    );

    protected Page ManageUsersPage = new Page(
            "Manage Users",
            "",
            "Manage Users"
    );

    protected Page manageJurisdictionsPage = new Page(
            "Manage Jurisdictions",
            "",
            "Manage Jurisdictions"
    );

    protected Page adminEndpointsPage = new Page(
            "base:tlbl:central:admin-system-endpoints-title",
            "",
            "base:tlbl:central:admin-endpoints-title"
    );

    protected Page adminInfoPage = new Page(
            "base:tlbl:central:admin-system-info-title",
            "",
            "base:tlbl:central:admin-info-title"
    );

    protected Page textContentPage = new Page(
            "Text Content",
            "",
            "Text Content"
    );

    protected Page contentTemplatesPage = new Page(
            "Touchpoint Data Lists",
            "",
            "base:tlbl:central:content-template-title"
    );


    /*Users implementation*/

    protected String adminUserName = "";
    protected String adminUserPassword = "";
    protected String ukJurisdictionOperatorName = "";
    protected String ukJurisdictionOperatorPassword = "";
    protected String testUserName = "";
    protected String testUserPassword = "";


    /*Used methods on every page*/

    protected void clickOnTheTestIcon() {

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

    protected void assertAccessDeniedText() {

        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[3]/div/div/section/div/div/div/div/p[2]/span")).getText(), "Access is denied");

    }

}