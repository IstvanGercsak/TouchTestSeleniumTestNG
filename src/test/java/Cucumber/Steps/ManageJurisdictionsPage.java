package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ManageJurisdictionsPage extends BaseUtil {

    private BaseUtil base;

    public ManageJurisdictionsPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Manage Jurisdictions Lists page$")
    public void iArriveOnTheManageJurisdictionsListsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), MANAGEJURISDICTIONPAGE());

    }
}
