package content.pages.login;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class LoginPage extends AbstractPage{

    @AndroidFindBy(id = "com.revolut.revolut.test:id/uic_edit_country_code")
    private WebElement countryCodeSelector;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/uic_edit_phone_number")
    private WebElement phoneNumberField;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/signup_next")
    private WebElement nextButton;

    public void tapCountryCodeSelector() {
        countryCodeSelector.click();
    }

    public LoginPage enterPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
        return this;
    }

    public void tapNextButton() {
        nextButton.click();
    }


}
