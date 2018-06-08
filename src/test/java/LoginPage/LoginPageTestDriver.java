package LoginPage;

import BaseTestData.BaseData;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPageTestDriver extends BaseData {

    public void findInvalidMessage() {
        driver.findElement(By.className("alert-danger"));
    }

}
