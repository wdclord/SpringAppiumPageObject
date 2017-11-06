package content.steps;

import content.pages.PaymentMethodPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

@Component
public class PaymentMethodSteps {

    @Autowired
    private PaymentMethodPage paymentMethodPage;

    @Step
    public void openBankTransferPage() {
        paymentMethodPage.tapToBankAccount();
    }

}
