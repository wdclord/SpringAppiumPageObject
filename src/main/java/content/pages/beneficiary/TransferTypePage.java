package content.pages.beneficiary;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class TransferTypePage extends AbstractPage {

    @AndroidFindBy(xpath = "//*[contains(@text,'To myself')]")
    private WebElement toMyselfRadioButton;
    @AndroidFindBy(xpath = "//*[contains(@text,'To another person')]")
    private WebElement toAnotherPersonRadioButton;
    @AndroidFindBy(xpath = "//*[contains(@text,'To a business')]")
    private WebElement toBusinessRadioButton;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/button_next")
    private WebElement nextButton;

    public void selectTransferTypeToMyself() {
        toMyselfRadioButton.click();
        nextButton.click();
    }

    public void selectTransferTypeToAnotherPerson() {
        toAnotherPersonRadioButton.click();
        nextButton.click();
    }

    public void selectTransferTypeToCompany() {
        toBusinessRadioButton.click();
        nextButton.click();
    }
}
