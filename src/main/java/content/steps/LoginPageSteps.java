package content.steps;

import content.pages.CountryCodeSelectorPage;
import content.pages.LoginPage;
import content.pages.PassCodePage;
import content.pages.SmsCodePage;
import io.appium.java_client.android.AndroidDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

@Component
public class LoginPageSteps {

    @Autowired
    private AndroidDriver driver;

    @Autowired
    SkipPageSteps skipPageSteps;

    @Autowired
    LoginPage loginPage;

    @Autowired
    SmsCodePage smsCodePage;

    @Autowired
    CountryCodeSelectorPage countryCodeSelectorPage;

    @Autowired
    private PassCodePage passCodePage;


    @Step
    public void loginToApplication() {
        skipPageSteps.skipTutorialPage();
        loginPage.gotoCountryCodeSelectorPage();
        countryCodeSelectorPage.enterCountryCode("+44").selectUnitedKingdom();
        loginPage.enterPhoneNumber("1217104665").authorize();
        passCodePage
                .clickDigit(1)
                .clickDigit(2)
                .clickDigit(4)
                .clickDigit(5);
        smsCodePage.enterSmsCode();
        skipPageSteps
                .skipEnableInstantMoneyTransfersPage()
                .skipEnableAdditionalSecurityPage();
    }


    @Step
    public void futherLoginToApplication() {
        loginToApplication();
        driver.closeApp();
        driver.launchApp();
        passCodePage
                .clickDigit(1)
                .clickDigit(2)
                .clickDigit(4)
                .clickDigit(5);

    }


}
