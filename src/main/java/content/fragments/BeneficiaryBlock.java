package content.fragments;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class BeneficiaryBlock extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/item_title")
    private WebElement beneficiaryNameAndCurrency;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/item_subtitle1")
    private WebElement firstBeneficiaryAccountDetails;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/item_subtitle2")
    private WebElement secondBeneficiaryAccountDetails;

    public String getBeneficiaryNameAndCurrency() {
        return beneficiaryNameAndCurrency.getText();
    }

    public String getFirstBeneficiaryAccountDetails() {
        return firstBeneficiaryAccountDetails.getText();
    }

    public String getSecondBeneficiaryAccountDetails() {
        return secondBeneficiaryAccountDetails.getText();
    }
}
