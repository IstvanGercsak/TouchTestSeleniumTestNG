package Cucumber.Steps;


import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Touchpoints extends BaseUtil {

    private BaseUtil base;

    public Touchpoints(BaseUtil base) {
        this.base = base;
    }


//    @Then("^The <search_by> option are available$")
//    public void theSearch_byOptionIsAvailable(String searchby) throws InterruptedException {
//
//        WebElement mySelectElement = driver.findElement(By.tagName("select"));
//        Select dropdown = new Select(mySelectElement);
//        driver.findElement(By.tagName("select")).click();
//        dropdown.selectByVisibleText(searchby);
//        driver.findElement(By.tagName("select")).click();
//        Thread.sleep(3000);
//
//    }
//
}
