package content.steps;

import content.data.user.User;
import content.pages.login.LoginPage;
import content.pages.login.PassCodePage;
import content.pages.login.SmsCodePage;
import content.pages.selectors.CountryCallingCodeSelectorPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

@Component
public class LoginSteps {

    @Autowired
    private SkipPageSteps skipPageSteps;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private SmsCodePage smsCodePage;
    @Autowired
    private CountryCallingCodeSelectorPage countryCallingCodeSelectorPage;
    @Autowired
    private PassCodePage passCodePage;


    @Step
    public void loginToApplication(User user) {
        skipPageSteps.skipTutorialPage();
        loginPage.tapCountryCodeSelector();
        countryCallingCodeSelectorPage.select(user.getCountry());
        loginPage
                .enterPhoneNumber(user.getPhoneNumber())
                .tapNextButton();
        passCodePage.enterPasscode(user.getPasscode());
        smsCodePage.enterSmsCode();
        skipPageSteps
                .skipEnableInstantMoneyTransfersPage()
                .skipEnableAdditionalSecurityPage();
    }

}
