package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;


public class TouchCentralActionsPage extends BaseUtil {

    private BaseUtil base;

    public TouchCentralActionsPage(BaseUtil base) {
        this.base = base;
    }


    @Then("^I arrive on the Touch Central Page$")
    public void iArriveOnTheTouchCentralPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), UKPAGE);

    }

    @Then("^The UK link not visible$")
    public void theUKLinkNotVisible() {

        Assert.assertNotEquals(base.driver.getCurrentUrl(), UKPAGE);

    }
}
