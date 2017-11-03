package content.steps;

import content.pages.CountryCodeSelectorPage;
import content.pages.LoginPage;
import content.pages.TutorialPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

@Component
public class LoginPageSteps {

    @Autowired
    TutorialPage tutorialPage;

    @Autowired
    LoginPage loginPage;

    @Autowired
    CountryCodeSelectorPage countryCodeSelectorPage;


    @Step
    public void loginToApplication() {
        tutorialPage.gotoLoginPage();
        loginPage.gotoCountryCodeSelectorPage();
        countryCodeSelectorPage.enterCountryCode("+44").selectUnitedKingdom();
        loginPage.enterPhoneNumber("1217104665").authorize();
    }

}
