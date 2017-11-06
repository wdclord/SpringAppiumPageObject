package content.pages.beneficiary.accountdetails;

import framework.page.BaseAccountDetailsPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class PersonAccountDetailsPage extends BaseAccountDetailsPage {

    @AndroidFindBy(xpath = "")
    private WebElement firstNameField;
    @AndroidFindBy(xpath = "")
    private WebElement lastNameField;
    @AndroidFindBy(xpath = "")
    private WebElement accountNumberField;
    @AndroidFindBy(xpath = "")
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
