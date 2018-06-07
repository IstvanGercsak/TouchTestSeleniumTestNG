package LoginPageTest;

import BaseTestData.BaseData;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class LoginPageTestDriver extends BaseData {


    public void login(String TESTUSERNAME, String TESTPASSWORD) {


        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
    }

    public void findInvalidMessage() {
        driver.findElement(By.className("alert-danger"));
    }

    public void urlIsAssert(String checkPage) {

        Assert.assertEquals(driver.getCurrentUrl(), checkPage);
    }

}
