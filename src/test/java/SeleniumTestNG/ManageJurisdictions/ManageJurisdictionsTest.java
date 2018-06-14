package SeleniumTestNG.ManageJurisdictions;

import SeleniumTestNG.BaseData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageJurisdictionsTest extends BaseData {

    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginPage.url());

    }

    @Test
    public void manageJurisdictionsIsAvailable() {

    }

    @Test
    public void manageJurisdictionsBreadcrumb() {
    }

    @Test
    public void manageJurisdictionsMetLifeIconDirection() {
    }

    @Test
    public void manageJurisdictionsUserIconDirection() {
    }

    @Test
    public void manageJurisdictionsLogout() {
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
