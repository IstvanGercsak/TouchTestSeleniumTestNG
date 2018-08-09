package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DashboardPage extends BaseUtil {

    private BaseUtil base;

    public DashboardPage(BaseUtil base) {
        this.base = base;
    }

    private static final String[] DROPDOWNLISTELEMENT = {"GLOBAL", "USA", "Mexico", "Brazil", "Poland"};

    private void listElementsAreClickable() {

        WebElement mySelectElement = base.driver.findElement(By.tagName("select"));
        Select dropdown = new Select(mySelectElement);

        for (String name : DROPDOWNLISTELEMENT) {

            base.driver.findElement(By.tagName("select")).click();
            dropdown.selectByVisibleText(name);

        }

    }

    @Then("^I can click on all of the elements$")
    public void iCanClickOnAllOfTheElements() {

        listElementsAreClickable();

    }

    @Then("^I arrive on the Dashboard page$")
    public void iArriveOnTheDashboardPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), DASHBOARDPAGE);

    }
}
