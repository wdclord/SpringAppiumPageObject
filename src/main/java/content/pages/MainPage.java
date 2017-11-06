package content.pages;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class MainPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/bottomBar")
    private WebElement bottomBar;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/button_transfer")
    private WebElement transferButton;

    public void tapTransferButton(){
        transferButton.click();
    }

}
