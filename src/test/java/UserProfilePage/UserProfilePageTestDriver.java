package UserProfilePage;

import BaseTestData.BaseData;
import org.openqa.selenium.By;

class UserProfilePageTestDriver extends BaseData {

    void clickTheButton(String button) {

        driver.findElement(By.linkText(button)).click();

    }


}
