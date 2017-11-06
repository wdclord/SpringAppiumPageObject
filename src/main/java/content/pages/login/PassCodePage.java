package content.pages.login;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

@Page
public class PassCodePage extends AbstractPage {

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

    private PassCodePage tapDigit(int digit) {
        getDigit(digit).click();
        return this;
    }

    public void enterPasscode(int passcode){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (passcode > 0) {
            stack.push(( passcode % 10));
            passcode = passcode / 10;
        }
        while (!stack.isEmpty()) {
            tapDigit(stack.pop());
        }
    }
}
