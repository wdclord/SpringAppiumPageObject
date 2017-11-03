package content.pages;

import framework.page.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page
public class LoginPage {

    @FindBy(id = "com.revolut.revolut.test:id/uic_edit_country_code")
    private WebElement countryCodeSelector;

    @FindBy(id = "com.revolut.revolut.test:id/uic_edit_phone_number")
    private WebElement phoneNumberField;

    @FindBy(id = "com.revolut.revolut.test:id/signup_next")
    private WebElement nextButton;


    public void gotoCountryCodeSelectorPage() {
        countryCodeSelector.click();
    }

    public LoginPage enterPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
        return this;
    }

    public void authorize() {
        nextButton.click();
    }


}
