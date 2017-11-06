package content.pages.beneficiary.accountdetails;

import framework.page.BaseAccountDetailsPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class CompanyAccountDetails extends BaseAccountDetailsPage {

    @AndroidFindBy(xpath = "")
    private WebElement companyNameField;
    @AndroidFindBy(xpath = "")
    private WebElement accountNumberField;
    @AndroidFindBy(xpath = "")
    private WebElement sortCodeField;

    public CompanyAccountDetails enterCompanyName(String companyName) {
        companyNameField.sendKeys(companyName);
        return this;
    }

    public CompanyAccountDetails enterAccountNumber(String accountNumber) {
        accountNumberField.sendKeys(accountNumber);
        return this;
    }

    public CompanyAccountDetails enterSortCode(String sortCode) {
        sortCodeField.sendKeys(sortCode);
        return this;
    }
}
