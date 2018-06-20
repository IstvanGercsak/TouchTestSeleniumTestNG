package SeleniumTestNG.DashboardPage;

import SeleniumTestNG.BaseData.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class DashboardPageDriverTest extends BaseData {



    void listElementsAreClickable(String[] getElements) {

        WebElement mySelectElement = driver.findElement(By.tagName("select"));
        Select dropdown = new Select(mySelectElement);

        for (String name : getElements) {

            driver.findElement(By.tagName("select")).click();
            dropdown.selectByVisibleText(name);

        }

    }

}
