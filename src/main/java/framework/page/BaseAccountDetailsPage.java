package framework.page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public abstract class BaseAccountDetailsPage extends AbstractPage {

    @AndroidFindBy(xpath = "")
    private WebElement phoneNumberField;
    @AndroidFindBy(xpath = "")
    private WebElement emailAddressField;
    @AndroidFindBy(xpath = "")
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
