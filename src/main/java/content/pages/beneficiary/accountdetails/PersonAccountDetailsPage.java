package content.pages.beneficiary.accountdetails;

import framework.page.BaseAccountDetailsPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class PersonAccountDetailsPage extends BaseAccountDetailsPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/first_name")
    private WebElement firstNameField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/last_name")
    private WebElement lastNameField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/server_field_0")
    private WebElement accountNumberField;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/server_field_1")
    private WebElement sortCodeField;

    public PersonAccountDetailsPage enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public PersonAccountDetailsPage enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public PersonAccountDetailsPage enterAccountNumber(String accountNumber) {
        accountNumberField.sendKeys(accountNumber);
        return this;
    }

    public PersonAccountDetailsPage enterSortCode(String sortCode) {
        sortCodeField.sendKeys(sortCode);
        return this;
    }


}
