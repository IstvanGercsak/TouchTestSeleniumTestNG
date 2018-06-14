package SeleniumTestNG.LoginPage;

import SeleniumTestNG.BaseData.BaseData;
import org.openqa.selenium.By;

public class LoginPageTestDriver extends BaseData {

    void findInvalidMessage() {
        driver.findElement(By.className("alert-danger"));
    }

}
