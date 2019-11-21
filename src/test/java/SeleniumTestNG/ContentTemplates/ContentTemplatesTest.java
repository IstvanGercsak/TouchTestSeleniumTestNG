package SeleniumTestNG.ContentTemplates;

import SeleniumTestNG.BaseData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContentTemplatesTest extends BaseData {

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
    public void contentTemplatesIsAvailable() {

    }

    @Test
    public void contentTemplatesBreadcrumb() {
    }

    @Test
    public void contentTemplatesTestIconDirection() {
    }

    @Test
    public void contentTemplatesUserIconDirection() {
    }

    @Test
    public void contentTemplatesLogout() {
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
