package content.steps;

import content.pages.beneficiary.BankTransferPage;
import content.pages.skip.TransferMoneyGloballyPage;
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
}
