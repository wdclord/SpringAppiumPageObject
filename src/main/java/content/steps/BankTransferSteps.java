package content.steps;

import content.pages.beneficiary.BankTransferPage;
import content.pages.skip.TransferMoneyGloballyPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankTransferSteps {

    @Autowired
    private BankTransferPage bankTransferPage;
    @Autowired
    private MainPageSteps mainPageSteps;
    @Autowired
    private PaymentMethodSteps paymentMethodSteps;
    @Autowired
    private SkipPageSteps skipPageSteps;

    public void openNewBeneficiaryPage() {

        mainPageSteps.openPaymentMethodPage();
        paymentMethodSteps.openBankTransferPage();
        skipPageSteps.skipTransferMoneyGloballyPage();
        bankTransferPage.tapAddNewBeneficiaryButton();

    }

    public boolean checkFullName(String fullName) {
        String actualResult = bankTransferPage.getFirstBeneficiaryBlock().getBeneficiaryNameAndCurrency();
        return actualResult.startsWith(fullName);
    }

    public boolean checkCompanyName(String companyName) {
        String actualResult = bankTransferPage.getFirstBeneficiaryBlock().getBeneficiaryNameAndCurrency();
        return actualResult.startsWith(companyName);
    }

    public boolean checkCurrency(String currency) {
        String actualResult = bankTransferPage.getFirstBeneficiaryBlock().getBeneficiaryNameAndCurrency();
        return actualResult.endsWith(currency);
    }

    public boolean checkAccountNumber(String accountNumber) {
        String actualResult = bankTransferPage.getFirstBeneficiaryBlock().getFirstBeneficiaryAccountDetails();
        return actualResult.endsWith(accountNumber);
    }

    public boolean checkSortCode(String sortCode) {
        String actualResult = bankTransferPage.getFirstBeneficiaryBlock().getSecondBeneficiaryAccountDetails();
        return actualResult.endsWith(sortCode);
    }


//
//    @Autowired
//    AndroidDriver driver;
//
//    void test1(){
//
//    WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOf(sortCodeField));
//    }
}
