package Suits.mobile;

import Suits.BaseTest;
import content.pages.skip.TutorialPage;
import content.steps.LoginSteps;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class TutorialPageTest extends BaseTest {

    @Autowired
    AndroidDriver driver;

    @Autowired
    private LoginSteps loginSteps;

    @Autowired
    private TutorialPage tutorialPage;



    @Test
    void login() {
//        loginSteps.loginToApplication();
    }

    @Test
    void skipTutorialPage() {
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
        tutorialPage.clickContinueButton();
    }

    @Test
    void login2() {
//        loginSteps.loginToApplication();
    }

}
