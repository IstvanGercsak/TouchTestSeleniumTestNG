package TouchpointPage;

import BaseTestData.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class TouchPointPageDriverTest extends BaseData {

    public class ReadFile {

        String[] readLines(String filename) throws IOException {
            FileReader fileReader = new FileReader(filename);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<String>();
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();

            return lines.toArray(new String[lines.size()]);
        }

    }

    void assertTheFileWithList(String txt) {

        ReadFile rf = new ReadFile();
        String filename = txt;
        String[] textList = new String[200];
        int i = 0;

        try {
            String[] lines = rf.readLines(filename);

            for (String line : lines) {
                String[] list = new String[i];
                //TODO: Pairing
                //System.out.println(line);
                //Assert.assertEquals(line,);
            }
        } catch (IOException e) {
            // Print out the exception that occurred
            System.out.println("Unable to create " + filename + ": " + e.getMessage());
        }
    }

    void goToTouchpoint() {

        clickOnTextLink("UK");

    }

    void goToCreateToucpointPage() {

        driver.findElement(By.name("reference")).sendKeys("UKT1009");
        driver.findElement(By.className("btn-default")).click();
        driver.findElement(By.linkText("Create New Touchpoint")).click();
        driver.findElement(By.id("search-contacts")).click();
        driver.findElement(By.className("glyphicon-search")).click();
        driver.findElement(By.linkText("Create New Contact")).click();

    }

    void searchByReference(String getMode, String getReference) {



    }

    void searchByName(String getMode, String getGivenName, String getFamilyName) {


    }

    void searchByEmail(String getMode, String getEmail) {


    }


    void choseMode(String getMode) {

        WebElement mySelectElement = driver.findElement(By.tagName("select"));
        Select dropdown = new Select(mySelectElement);
        driver.findElement(By.tagName("select")).click();
        dropdown.selectByVisibleText(getMode);
        driver.findElement(By.tagName("select")).click();

    }

//    void assertListElement(String[] getList) {
//
//        for (int i = 0; i < getList.length; i++) {
//            //Assert.assertEquals(getList[i]);
//        }
//
//    }

}