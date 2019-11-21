package Cucumber.Base;

import org.openqa.selenium.WebDriver;

public class BaseUtil {

    /* Webdriver implementation*/

    public WebDriver driver;

    /*Page Url implementation*/

    private static final String CENTRALPAGEURL = "";
    private static final String UKPAGE = "";
    private static final String LOGINPAGE = "";
    private static final String DASHBOARDPAGE = "";
    private static final String PROFILEPAGE = "";
    private static final String INVALIDLOGINPAGE = "";
    private static final String ABOUTPAGE = "";
    private static final String USERPROFILEPAGE = "";
    private static final String TOUCHPOINTFORMSPAGE = "";
    private static final String TOUCHPOINTDARALISTSPAGE = "";
    private static final String MANAGEUSERSPAGE = "";
    private static final String MANAGEJURISDICTIONPAGE = "";
    private static final String SYSTEMENDPOINTSTITLEPAGE = "";
    private static final String SYSTEMINFOTITLEPAGE = "";
    private static final String TEXTCONTENTPAGE = "";
    private static final String CONTENTTEMPLATESPAGE = "";
    private static final String TOUCHPOINTSRESULTPAGE = "";

    /* User details */

    private static final String ukJurisdictionOperatorName = "";
    private static final String ukJurisdictionOperatorPassword = "";
    private static final String adminName = "";
    private static final String adminPassword = "";
    private static final String mixedUserName = "";
    private static final String mixedUserPassword = "";

    /* Elements */

    private static final String TestIconClass = "img-responsive";
    private static final String userNameID = "username";
    private static final String passwordID = "password";
    private static final String userNameCSS = "#username";
    private static final String passwordCSS = "#password";
    private static final String loginButtonClass = "btn-primary";
    private static final String hamburgerNavigationID = "hamburger-nav";
    private static final String versionID = "version";
    private static final String commitID = "commit";
    private static final String buildnumberID = "buildnumber";
    private static final String timestampID = "timestamp";
    private static final String profileIconClass = "icon-medium";
    private static final String breadcrumbsContainerClass = "page-bar-title";
    private static final String accesDeniedErrorMessageXPath = "//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div/div/div/div/p[2]/span";


    protected String CENTRALPAGEURL() {
        return CENTRALPAGEURL;
    }

    protected String UKPAGE() {
        return UKPAGE;
    }

    protected String LOGINPAGE() {
        return LOGINPAGE;
    }

    protected String DASHBOARDPAGE() {
        return DASHBOARDPAGE;
    }

    protected String PROFILEPAGE() {
        return PROFILEPAGE;
    }

    protected String INVALIDLOGINPAGE() {
        return INVALIDLOGINPAGE;
    }

    protected String ABOUTPAGE() {
        return ABOUTPAGE;
    }

    protected String USERPROFILEPAGE() {
        return USERPROFILEPAGE;
    }

    protected static String TOUCHPOINTFORMSPAGE() {
        return TOUCHPOINTFORMSPAGE;
    }

    protected static String TOUCHPOINTDARALISTSPAGE() {
        return TOUCHPOINTDARALISTSPAGE;
    }

    protected static String MANAGEUSERSPAGE() {
        return MANAGEUSERSPAGE;
    }

    protected static String MANAGEJURISDICTIONPAGE() {
        return MANAGEJURISDICTIONPAGE;
    }

    protected static String SYSTEMENDPOINTSTITLEPAGE() {
        return SYSTEMENDPOINTSTITLEPAGE;
    }

    protected static String SYSTEMINFOTITLEPAGE() {
        return SYSTEMINFOTITLEPAGE;
    }

    protected static String TEXTCONTENTPAGE() {
        return TEXTCONTENTPAGE;
    }

    protected static String CONTENTTEMPLATESPAGE() {
        return CONTENTTEMPLATESPAGE;
    }

    protected static String TOUCHPOINTSRESULTPAGE() {
        return TOUCHPOINTSRESULTPAGE;
    }

    protected String ukJurisdictionOperatorName() {
        return ukJurisdictionOperatorName;
    }

    protected String ukJurisdictionOperatorPassword() {
        return ukJurisdictionOperatorPassword;
    }

    protected String adminName() {
        return adminName;
    }

    protected String adminPassword() {
        return adminPassword;
    }

    protected String mixedUserName() {
        return mixedUserName;
    }

    protected String mixedUserPassword() {
        return mixedUserPassword;
    }

    protected String TestIconClass() {
        return TestIconClass;
    }

    protected String userNameID() {
        return userNameID;
    }

    protected String passwordID() {
        return passwordID;
    }

    protected String userNameCSS() {
        return userNameCSS;
    }

    protected String passwordCSS() {
        return passwordCSS;
    }

    protected String loginButtonClass() {
        return loginButtonClass;
    }

    protected String hamburgerNavigationID() {
        return hamburgerNavigationID;
    }

    protected String versionID() {
        return versionID;
    }

    protected String commitID() {
        return commitID;
    }

    protected String buildnumberID() {
        return buildnumberID;
    }

    protected String timestampID() {
        return timestampID;
    }

    protected String profileIconClass() {
        return profileIconClass;
    }

    protected String breadcrumbsContainerClass() {
        return breadcrumbsContainerClass;
    }

    protected String accesDeniedErrorMessageXPath() {
        return accesDeniedErrorMessageXPath;
    }

}
