package content.pages.skip;

import framework.page.AbstractPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public abstract class BaseSkipPage extends AbstractPage {

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'header_next')]")
    protected WebElement skipButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'button')]")
    protected WebElement continueButton;

    public abstract void skipPage();

    public abstract void clickContinueButton();


}
