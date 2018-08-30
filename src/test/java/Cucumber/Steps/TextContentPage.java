package Cucumber.Steps;

import Cucumber.Base.BaseUtil;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TextContentPage extends BaseUtil {

    private BaseUtil base;

    public TextContentPage(BaseUtil base) {
        this.base = base;
    }

    @Then("^I arrive on the Text Content Lists page$")
    public void iArriveOnTheTextContentListsPage() {

        Assert.assertEquals(base.driver.getCurrentUrl(), TEXTCONTENTPAGE());

    }
}
