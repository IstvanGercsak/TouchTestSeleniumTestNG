package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ContentTemplatesPage extends BaseUtil {

    private BaseUtil base;

    public ContentTemplatesPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Content Templates Lists page$")
    public void iArriveOnTheContentTemplatesListsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), CONTENTTEMPLATESPAGE());

    }
}
