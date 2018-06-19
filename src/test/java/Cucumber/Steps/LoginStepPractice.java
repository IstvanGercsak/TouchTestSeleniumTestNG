//package Cucumber.Steps;
//
//import Cucumber.Base.BaseUtil;
//
//import cucumber.api.DataTable;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
///*CTRL + ALT + B -> Jump from the test to the method*/
//
//public class LoginStepPractice extends BaseUtil {
//
//    public class User {
//
//        public String username, password;
//
//        public User(String username, String password) {
//            this.username = username;
//            this.password = password;
//        }
//    }
//
//    private BaseUtil base;
//
//    public LoginStepPractice(BaseUtil base) {
//        this.base = base;
//    }
//
//    private static final String CENTRALPAGEURL = "https://touch-test-central.azurewebsites.net/central/";
//
//    @And("^I log into the Touch with the proper ([^\"]*) and ([^\"]*)$")
//    public void iLogIntoTheTouchWithTheProperUsernameAndPassword(String username, String password) {
//
//        base.driver.findElement(By.name("username")).sendKeys(username);
//        base.driver.findElement(By.name("password")).sendKeys(password);
//
//    }
//
//    @Then("^I arrive on the central page$")
//    public void iArriveOnTheCentralPage() {
//
//        Assert.assertEquals(base.driver.getCurrentUrl(), CENTRALPAGEURL);
//
//    }
//
//    @Given("^I navigate to the login page$")
//    public void iNavigateToTheLoginPage() {
//
//        base.driver.navigate().to("https://touch-test-central.azurewebsites.net/central/login");
//
//    }
//
//
//    @And("^I click on the login button$")
//    public void iClickOnTheLoginButton() {
//
//        /* The button type is submit -> submit method */
////        base.driver.findElement(By.name("Login")).submit();
//
//        base.driver.findElement(By.className("btn-primary")).click();
//
//    }
//
////    @Then("^I see the Touch central page$")
////    public void iSeeTheTouchCentralPage() {
////
////        Assert.assertEquals(base.driver.findElement(By.id("Initial")).isDisplayed(), true);
////
////    }
//
//    @And("^I enter the following for login$")
//    public void iEnterTheFollowingForLogin(DataTable table) {
//
//        /*        table.raw(); /*It is a is a <List<String>> */
//
////        List<List<String>> data = table.raw();
////        System.out.println("The value is: " + data.get(0).get(0).toString());
////        System.out.println("The value is: " + data.get(0).get(1).toString());
//
//        // Create an ArrayList
//
//        List<User> users = new ArrayList<User>();
//
//        // Store all the users
//
//        users = table.asList(User.class);
//
////        for (User user : users) {
////            System.out.println("The username is: " + user.username);
////            System.out.println("The password is: " + user.password);
////        }
//
//        for (User user : users) {
//
//            base.driver.findElement(By.name("UserName")).sendKeys(user.username);
//            base.driver.findElement(By.name("Password")).sendKeys(user.password);
//
//        }
//
//    }
//
//
//    @And("^I enter the \"([^\"]*)\" as admin user and \"([^\"]*)\" as admin password$")
//    public void iEnterTheAsAdminAndAsAdmin(String userName, String password) {
//
//        base.driver.findElement(By.name("UserName")).sendKeys(userName);
//        base.driver.findElement(By.name("Password")).sendKeys(password);
//
//
//    }
//
//    /*
//     "([^"]*)"
//     ([^"]*)
//     */
//
//    @And("^I enter ([^\"]*) and ([^\"]*)$")
//    public void iEnterUsernameAndPassword(String username, String password) {
//
//    }
//}
