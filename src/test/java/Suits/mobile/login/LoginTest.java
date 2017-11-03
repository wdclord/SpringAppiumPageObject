package Suits.mobile.login;

import Suits.Suite;
import content.pages.skip.TutorialPage;
import content.steps.LoginPageSteps;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginTest extends Suite {

    @Autowired
    private LoginPageSteps loginPageSteps;


    @Test
    public void firstLogin() {
        loginPageSteps.loginToApplication();
    }

    @Test
    public void futherLogin() {
        loginPageSteps.futherLoginToApplication();
    }

    @Test
    public void login2() {
        loginPageSteps.loginToApplication();
    }

}
