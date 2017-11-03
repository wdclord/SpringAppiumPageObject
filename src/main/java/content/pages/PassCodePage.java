package content.pages;

import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import org.openqa.selenium.WebElement;

import java.util.List;

@Page
public class PassCodePage {

    @AndroidFindAll({
            @AndroidBy(id = "com.revolut.revolut.test:id/button_0"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_1"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_2"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_3"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_4"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_5"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_6"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_7"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_8"),
            @AndroidBy(id = "com.revolut.revolut.test:id/button_9"),
    })
    private List<WebElement> digits;

    private WebElement getDigit(int digit) {
        return digits.get(digit);
    }

    public PassCodePage clickDigit(int digit) {
        getDigit(digit).click();
        return this;
    }
}
