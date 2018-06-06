package BaseTestData;

import org.openqa.selenium.WebDriver;

public class BaseData {

    public WebDriver driver;
    private static final String BASESITE = "https://touch-test-central.azurewebsites.net/central/login";


    public class Pages {
        public String name;
        public String url;
        Pages(String name, String url){
            this.name=name;
            this.url=url;
        }
    };

    public Pages Dashboard = new Pages("Dashboard","https://touch-test-central.azurewebsites.net/central/reports/dashboard");

    String[][] hamburgermenu = new String[][]{
            {"Touch Central Actions"},{"https://touch-test-central.azurewebsites.net/central/"},
            {"Dashboard"},{"https://touch-test-central.azurewebsites.net/central/reports/dashboard"},
            {"User Profile"},{"https://touch-test-central.azurewebsites.net/central/myprofile"},
            {"About Touch"},{"https://touch-test-central.azurewebsites.net/central/help/about"},
            {"Logout"},{"https://touch-test-central.azurewebsites.net/central/login"}
    };

    String[][] sites = new String[][]{
            {"Login"},{},
            {"Central"},{},
            {"UK"},{},
            {"Dashboard"},{}
    };

    protected String getBASESITE() {
        return BASESITE;
    }

}
