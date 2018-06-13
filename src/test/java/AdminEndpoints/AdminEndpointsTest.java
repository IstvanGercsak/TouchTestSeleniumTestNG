package AdminEndpoints;

import BaseTestData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminEndpointsTest extends BaseData {

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
    public void adminEndpointsIsAvailable() {

    }

    @Test
    public void adminEndpointsBreadcrumb() {
    }

    @Test
    public void adminEndpointsMetLifeIconDirection() {
    }

    @Test
    public void adminEndpointsUserIconDirection() {
    }

    @Test
    public void adminEndpointsLogout() {
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
