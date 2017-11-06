package Suits.mobile.login;

import Suits.BaseTest;
import content.data.user.User;
import content.data.user.UserFactory;
import content.steps.LoginSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class LoginTest extends BaseTest {

    @Autowired
    private LoginSteps loginSteps;

    @Autowired
    private UserFactory userFactory;

    @Test
    void firstLogin() {
        loginSteps.loginToApplication(userFactory.getDefaultUser());
    }

    @Test
    void futherLogin() {
        loginSteps.loginToApplication(userFactory.getDefaultUser());

    }

    @Test
    void login2() {
        loginSteps.loginToApplication(userFactory.getDefaultUser());

    }

}
