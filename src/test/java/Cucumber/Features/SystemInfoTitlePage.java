package Cucumber.Features;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class SystemInfoTitlePage extends BaseUtil {

    private BaseUtil base;

    public SystemInfoTitlePage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the System info title page$")
    public void iArriveOnTheSystemInfoTitlePage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), SYSTEMINFOTITLEPAGE());

    }
}
