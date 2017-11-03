package Suits.mobile;

import Suits.Suite;
import content.pages.skip.TutorialPage;
import content.steps.LoginPageSteps;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TutorialPageTest extends Suite {

    @Autowired
    AndroidDriver driver;

    @Autowired
    private LoginPageSteps loginPageSteps;

    @Autowired
    private TutorialPage tutorialPage;



    @Test
    public void login() {
        loginPageSteps.loginToApplication();
    }

    @Test
    public void skipTutorialPage() {
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
    }

    @Test
    public void login2() {
        loginPageSteps.loginToApplication();
    }

}
