package DashboardPage;

import BaseTestData.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class DashboardPageDriverTest extends BaseData {

    void listElementsAreClickable(String[] getElements) {

        WebElement mySelectElement = driver.findElement(By.tagName("select"));
        Select dropdown = new Select(mySelectElement);

        for (int i = 0; i < getElements.length; i++) {

            driver.findElement(By.tagName("select")).click();
            dropdown.selectByVisibleText(getElements[i]);

        }
    }

}
