package UserPage;

import LoginPage.LoginPageTestDriver;
import org.openqa.selenium.By;

public class RightsTestDriver extends LoginPageTestDriver {

    public void clickOnTheHamburgeMenuDropdown(){
        driver.findElement(By.id("hamburger-nav")).click();
    }

    public void clickOnTheHamburgerMenuElement(String getHamburgerElementName){
        driver.findElement(By.xpath("//a[contains(text(),'" + getHamburgerElementName + "')]")).click();
    }

}
