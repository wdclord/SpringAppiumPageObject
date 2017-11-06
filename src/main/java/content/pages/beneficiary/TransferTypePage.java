package content.pages.beneficiary;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class TransferTypePage extends AbstractPage {

    @AndroidFindBy(xpath = "")
    private WebElement toMyselfSelector;
    @AndroidFindBy(xpath = "")
    private WebElement toAnotherPersonSelector;
    @AndroidFindBy(xpath = "")
    private WebElement toBusinessSelector;
    @AndroidFindBy(xpath = "")
    private WebElement nextButton;

    public void selectTransferTypeToMyself() {
        toMyselfSelector.click();
        nextButton.click();
    }

    public void selectTransferTypeToAnotherPerson() {
        toAnotherPersonSelector.click();
        nextButton.click();
    }

    public void selectTransferTypeToCompany() {
        toBusinessSelector.click();
        nextButton.click();
    }
}
