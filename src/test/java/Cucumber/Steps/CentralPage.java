package Cucumber.Steps;

import Cucumber.Base.BaseUtil;

public class CentralPage extends BaseUtil {

    public class User {

        String username, password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    private BaseUtil base;

    public CentralPage(BaseUtil base) {
        this.base = base;
    }
}