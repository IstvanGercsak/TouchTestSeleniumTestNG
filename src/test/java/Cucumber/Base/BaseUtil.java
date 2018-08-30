package Cucumber.Base;

import org.openqa.selenium.WebDriver;

public class BaseUtil {

    /* Webdriver implementation*/

    public WebDriver driver;

    /*Page Url implementation*/
    private static final String CENTRALPAGEURL = "http://use1webapp01.zone.ase.metlife.com/central/";
    private static final String UKPAGE = "http://neukwebapp01.zone.ase.metlife.co.uk/zone/";
    private static final String LOGINPAGE = "http://use1webapp01.zone.ase.metlife.com/central/login";
    private static final String DASHBOARDPAGE = "http://use1webapp01.zone.ase.metlife.com/central/reports/dashboard";
    private static final String PROFILEPAGE = "http://use1webapp01.zone.ase.metlife.com/central/myprofile";
    private static final String INVALIDLOGINPAGE = "http://use1webapp01.zone.ase.metlife.com/central/login?error";
    private static final String ABOUTPAGE = "http://use1webapp01.zone.ase.metlife.com/central/help/about";
    private static final String USERPROFILEPAGE = "http://use1webapp01.zone.ase.metlife.com/central/myprofile";
    private static final String TOUCHPOINTFORMSPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/touchpoint/forms";
    private static final String TOUCHPOINTDARALISTSPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/touchpoint/datalists";
    private static final String MANAGEUSERSPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/system/users";
    private static final String MANAGEJURISDICTIONPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/system/jurisdictions";
    private static final String SYSTEMENDPOINTSTITLEPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/system/endpoints";
    private static final String SYSTEMINFOTITLEPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/system/info";
    private static final String TEXTCONTENTPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/content/text";
    private static final String CONTENTTEMPLATESPAGE = "http://use1webapp01.zone.ase.metlife.com/central/admin/content/templates";

    /* User details */

    private static final String ukJurisdictionOperatorName = "istvan.gercsak@gmail.com";
    private static final String ukJurisdictionOperatorPassword = "Igercsak8!#";
    private static final String adminName = "testadmin@testadmin.com";
    private static final String adminPassword = "Igercsak8!#";
    private static final String mixedUserName = "istvan.gercsak@metlife.com";
    private static final String mixedUserPassword = "Igercsak8!#";

    /* Elements */

    private static final String metLifeIconClass = "img-responsive";
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

    protected String metLifeIconClass() {
        return metLifeIconClass;
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
