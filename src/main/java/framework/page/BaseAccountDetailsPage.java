package framework.page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public abstract class BaseAccountDetailsPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/mobile_phone")
    private WebElement phoneNumberField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/email")
    private WebElement emailAddressField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/button_next")
    private WebElement nextButton;

    public BaseAccountDetailsPage enterPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
        return this;
    }

    public BaseAccountDetailsPage enterEmailAddress(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
        return this;
    }

    public BaseAccountDetailsPage tapNextButton() {
        nextButton.click();
        return this;
    }

}
