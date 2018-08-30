package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TouchpointDataListsPage extends BaseUtil {

    private BaseUtil base;

    public TouchpointDataListsPage(BaseUtil base) {
        this.base = base;
    }


    @Then("^I arrive on the Touchpoint Data Lists page$")
    public void iArriveOnTheTouchpointDataListsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), TOUCHPOINTDARALISTSPAGE());

    }
}
