package Steps;

import Base.BaseUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


/*CTRL + ALT + B -> Jump from the test to the method*/

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {

        System.out.println("1");
        base.driver.navigate().to("http://executeautomation.com/demosite/Login.html");
    }


    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {

        System.out.println("3");

    }

    @Then("^I see the Touch central page$")
    public void iSeeTheTouchCentralPage() {

        System.out.println("4");

    }

//    @And("^I enter the following for login$")
//    public void iEnterTheFollowingForLogin(DataTable table) {
//
//        /*        table.raw(); /*It is a is a <List<String>> */
//
//        List<List<String>> data = table.raw();
//
////        System.out.println("The value is: " + data.get(0).get(0).toString());
////        System.out.println("The value is: " + data.get(0).get(1).toString());
//
//        // Create an ArrayList
//        List<User> users = new ArrayList<User>();
//        // Store all the users
//        users = table.asList(User.class);
//
//        for (User user : users) {
//            System.out.println("The username is: " + user.username);
//            System.out.println("The password is: " + user.password);
//        }
//
//    }


    @And("^I enter the \"([^\"]*)\" as admin and \"([^\"]*)\" as admin$")
    public void iEnterTheAsAdminAndAsAdmin(String userName, String password) {

    }

    /*
     "([^"]*)"
     */

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {

    }

    public class User {

        public String username, password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

}
