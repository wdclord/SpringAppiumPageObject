package Suits.mobile;

import Suits.Suite;
import content.pages.TutorialPage;
import content.steps.LoginPageSteps;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TutorialPageTest extends Suite {

    @Autowired
    private LoginPageSteps loginPageSteps;

    @Autowired
    private TutorialPage tutorialPage;

    @Autowired
    private AndroidDriver driver;


    @Before
    public void setup(){
        System.out.println("LAUNCH");
        driver.launchApp();
    }


    @After
    public void cleanUp(){
        System.out.println("QUIT");
        driver.closeApp();
    }


    @Test
    public void login() {
        loginPageSteps.loginToApplication();
    }

    @Test
    public void skipTutorialPage() {
        tutorialPage.gotoLoginPage();
    }

}
