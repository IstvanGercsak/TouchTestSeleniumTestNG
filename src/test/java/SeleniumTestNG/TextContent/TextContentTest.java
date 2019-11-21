package SeleniumTestNG.TextContent;

import SeleniumTestNG.BaseData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextContentTest extends BaseData {

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
    public void textContentIsAvailable() {

    }

    @Test
    public void textContentBreadcrumb() {
    }

    @Test
    public void textContentTestIconDirection() {
    }

    @Test
    public void textContentUserIconDirection() {
    }

    @Test
    public void textContentLogout() {
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
