package content.pages;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class PaymentMethodPage extends AbstractPage{

    @AndroidFindBy(xpath = "//*[contains(@text,'To bank account')]")
    private WebElement toBankAccountButton;

    public void tapToBankAccount(){
        toBankAccountButton.click();
    }

}
