package content.steps;

import content.pages.MainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

@Component
public class MainPageSteps {

    @Autowired
    private MainPage mainPage;

    @Step
    public void openPaymentMethodPage(){
        mainPage.tapTransferButton();
    }
}
