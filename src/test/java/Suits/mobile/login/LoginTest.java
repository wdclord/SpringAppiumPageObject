package Suits.mobile.login;

import Suits.BaseTest;
import content.data.user.User;
import content.data.user.UserFactory;
import content.steps.LoginSteps;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class LoginTest extends BaseTest {

    @Autowired
    private LoginSteps loginSteps;

    @Autowired
    private UserFactory userFactory;

    @Autowired
    private User user;

    @Test
    void login() {
        user = userFactory.getDefaultUser();
        loginSteps.loginToApplication(user);
    }

}
