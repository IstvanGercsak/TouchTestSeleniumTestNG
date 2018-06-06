package User;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightsTest extends RightsTestDriver {


    private static final String ADMINUSER = "istvan.gercsak@metlife.com";
    private static final String ADMINUSERPASSWORD = "Igercsak8!#";
    private static final String TOUCHUSER = "";
    private static final String TOUCHUSERPASSWORD = "";

    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getBASESITE());

    }

    @Test(description = "Login with admin")
    public void loginWithAdmin() {
        login(ADMINUSER, ADMINUSERPASSWORD);
    }

    @Test(description = "Login with Touchpoint administrator")
    public void loginWithTouchpointUser() {
        login(TOUCHUSER, TOUCHUSERPASSWORD);
    }

    //Todo
    @Test(description = "I can reach every page with admin permission")
    public void reachPagesWithAdmin() {
        login(ADMINUSER, ADMINUSERPASSWORD);
        driver.findElement(By.id("hamburger-nav")).click();
        driver.findElement(By.xpath("//a[contains(text(),'" + Dashboard.name + "')]")).click();
    }

    @Test(description = "I can reach every page with admin permission")
    public void reachPagesWithTouchUser() {
        login(TOUCHUSER, TOUCHUSERPASSWORD);
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}


