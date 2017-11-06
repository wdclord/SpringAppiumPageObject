package content.pages.login;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class SmsCodePage extends AbstractPage{

    @AndroidFindBy(id = "com.revolut.revolut.test:id/debug_sms_code")
    private WebElement smsCode;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/fake_edit_text")
    private WebElement smsCodeField;

    private String getSmsCode() {
        return smsCode.getText();
    }

    public void enterSmsCode() {
        smsCode.sendKeys(getSmsCode());
    }

}
