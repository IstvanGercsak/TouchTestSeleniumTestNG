package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TouchpointFormsPage extends BaseUtil{

    private BaseUtil base;

    public TouchpointFormsPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Touchpoint Forms page$")
    public void iArriveOnTheTouchpointFormsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(),TOUCHPOINTFORMSPAGE());

    }
}
