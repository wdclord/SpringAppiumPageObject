package framework.page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public abstract class BaseSelectorPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/search_src_text")
    private WebElement searchField;

    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement firstResult;

    public void select(String text) {
        searchField.sendKeys(text);
        firstResult.click();
    }
}
