package BaseTestData;

import org.openqa.selenium.WebDriver;
public class BaseData {

    public WebDriver driver;
    private static final String BASESITE = "https://touch-test-central.azurewebsites.net/central/login";


    protected String getBASESITE() {
        return BASESITE;
    }

}
