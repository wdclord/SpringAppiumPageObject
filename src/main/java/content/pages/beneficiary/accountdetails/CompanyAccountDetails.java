package content.pages.beneficiary.accountdetails;

import framework.page.BaseAccountDetailsPage;
import framework.page.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

@Page
public class CompanyAccountDetails extends BaseAccountDetailsPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/organization_name")
    private WebElement companyNameField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/server_field_0")
    private WebElement accountNumberField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/server_field_1")
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
