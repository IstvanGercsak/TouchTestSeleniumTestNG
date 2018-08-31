package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TextContentPage extends BaseUtil {

    private BaseUtil base;

    public TextContentPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Text Content Lists page$")
    public void iArriveOnTheTextContentListsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), TEXTCONTENTPAGE());

    }

    @And("^I click on the ([^\"]*) text id$")
    public void iClickOnTheText_idTextId(String textID) {

        base.driver.findElement(By.linkText(textID)).click();

    }

    @And("^I can see the right ([^\"]*) text locale, ([^\"]*) title, ([^\"]*) text title and ([^\"]*) text description$")
    public void iCanSeeTheRightText_localeTextLocaleText_titleTitleText_titleTextTitleAndText_descriptionTextDescription(
            String textLocale,
            String mainTextTitle,
            String textTitle,
            String textDescription) throws InterruptedException {

        Thread.sleep(1000);

        Assert.assertEquals(base.driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div[2]/div/table/tbody/tr/td[1]/span")).getText(), textLocale);
        Assert.assertEquals(base.driver.findElement(By.className("header3-font")).getText(), mainTextTitle);
        Assert.assertEquals(base.driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div[2]/div/table/tbody/tr/td[2]/span")).getText(), textTitle);
        Assert.assertEquals(base.driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div[2]/div/table/tbody/tr/td[3]/span")).getText(), textDescription);

    }

    @And("^I click on the modification pencil button$")
    public void iClickOnTheModificationPencilButton() throws InterruptedException {

        Thread.sleep(1000);

        base.driver.findElement(By.id("updateModalButton")).click();

    }

    @And("^I click on the Cancel button$")
    public void iClickOnTheCancelButton() {

        WebDriverWait wait = new WebDriverWait(base.driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-primary")));

        base.driver.findElement(By.className("btn-primary")).click();

    }

    @And("^I click on the Save button$")
    public void iClickOnTheSaveButton() {

        base.driver.findElement(By.id("saveUpdate")).click();

    }

    @And("^I modify the Resource Title to ([^\"]*) and the Resource Description to ([^\"]*)$")
    public void iModifyTheResourceTitleToTitle_modification_toAndTheResourceDescriptionToText_description_modification_to(
            String resourceTitle,
            String resourceDescription) throws InterruptedException {

        Thread.sleep(1000);

        base.driver.findElement(By.id("valueUpdateResourceTitle")).click();
        base.driver.findElement(By.id("valueUpdateResourceTitle")).clear();
        base.driver.findElement(By.id("valueUpdateResourceTitle")).sendKeys(resourceTitle);

        base.driver.findElement(By.id("valueUpdateResourceDescription")).click();
        base.driver.findElement(By.id("valueUpdateResourceDescription")).clear();
        base.driver.findElement(By.id("valueUpdateResourceDescription")).sendKeys(resourceDescription);

    }
}
