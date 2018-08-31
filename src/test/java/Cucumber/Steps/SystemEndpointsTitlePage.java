package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class SystemEndpointsTitlePage extends BaseUtil {

    private BaseUtil base;

    public SystemEndpointsTitlePage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the System endpoints title page$")
    public void iArriveOnTheSystemEndpointsTitlePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(),SYSTEMENDPOINTSTITLEPAGE());

    }
}
