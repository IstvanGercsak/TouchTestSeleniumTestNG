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

    /* User details */

    public String ukJurisdictionOperatorName = "istvan.gercsak@gmail.com";
    public String ukJurisdictionOperatorPassword = "Igercsak8!#";
    public String adminName = "testadmin@testadmin.com";
    public String adminPassword = "Igercsak8!#";
    public String mixedUserName = "istvan.gercsak@metlife.com";
    public String mixedUserPassword = "Igercsak8!#";

    /* Elements */

    public String metLifeIconClass = "img-responsive";
    public String userNameID = "username";
    public String passwordID = "password";
    public String userNameCSS = "#username";
    public String passwordCSS = "#password";
    public String loginButtonClass = "btn-primary";
    public String hamburgerNavigationID = "hamburger-nav";
    public String versionID = "version";
    public String commitID = "commit";
    public String buildnumberID = "buildnumber";
    public String timestampID = "timestamp";
    public String profileIconClass = "icon-medium";
    public String breadcrumbsContainerClass = "page-bar-title";
    public String accesDeniedErrorMessageXPath = "//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div/div/div/div/p[2]/span";


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

}
