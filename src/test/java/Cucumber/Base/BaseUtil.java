package Cucumber.Base;

import org.openqa.selenium.WebDriver;

public class BaseUtil {

    /* Webdriver implementation*/
    public WebDriver driver;

    /*Page Url implementation*/
    public String CENTRALPAGEURL = "https://touch-test-central.azurewebsites.net/central/";
    public String DASHBOARDPAGE = "https://touch-test-central.azurewebsites.net/central/reports/dashboard";
    public String UKPAGE = "http://touch-test-zone.azurewebsites.net/uk/";
    public String LOGINPAGE = "https://touch-test-central.azurewebsites.net/central/login";
    public String PROFILEPAGE = "https://touch-test-central.azurewebsites.net/central/myprofile";
    public String INVALIDLOGINPAGE = "https://touch-test-central.azurewebsites.net/central/login?error";

    /* User details */
    public String ukJurisdictionOperatorName = "istvan.gercsak@gmail.com";
    public String ukJurisdictionOperatorPassword = "Igercsak8!#";

}
