package LoginPageTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends LoginPageTestDriver {

    private static final String TESTPLOGINAGE = "https://touch-test-central.azurewebsites.net/central/login";
    private static final String INVALIDLOGIPNAGE = "https://touch-test-central.azurewebsites.net/central/login?error";
    private static final String TESTPAGE = "https://touch-test-central.azurewebsites.net/central/";
    private static final String TESTUSERNAME = "istvan.gercsak@metlife.com";
    private static final String TESTPASSWORD = "Igercsak8!#";


    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getBASESITE());

    }


    @Test(description = "Touch is available!")
    public void touchIsAvailable() {

        urlIsAssert(TESTPLOGINAGE);

    }

    @Test(description = "I can log into the application")
    public void loginIntoTouch() {

        login(TESTUSERNAME, TESTPASSWORD);
        urlIsAssert(TESTPAGE);

    }

    @Test(description = "I don't give username or password")
    public void redirectedToInvalidLoginPage() {

        login("", "");
        Assert.assertEquals(driver.getCurrentUrl(), INVALIDLOGIPNAGE);

    }

    @Test(description = "I don't give username or passwowrd and a message appears")
    public void messageApperAfterWrongLoginDetails() {

        login("", "");
        findInvalidMessage();

    }

    @Test(description = "Log in after wrong username or password")
    public void loginAfterWrongdetails() {

        login("", "");
        login(TESTUSERNAME, TESTPASSWORD);
        urlIsAssert(TESTPAGE);

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
