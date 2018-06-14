package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    /* Dependency injection */

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initailazedTest() {

        ChromeDriverManager.getInstance().setup();
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();


    }

    @After
    public void tearDownTest() {

        base.driver.close();

    }

}
