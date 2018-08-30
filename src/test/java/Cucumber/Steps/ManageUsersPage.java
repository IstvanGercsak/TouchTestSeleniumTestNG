package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ManageUsersPage extends BaseUtil {

    private BaseUtil base;

    public ManageUsersPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Manage Users Lists page$")
    public void iArriveOnTheManageUsersListsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), MANAGEUSERSPAGE());

    }
}
