package framework.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseSelectorPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/search_src_text")
    private WebElement searchField;

    @AndroidFindBy(id = "com.revolut.revolut.test:id/country_item")
    private WebElement firstResult;

    @Autowired
    private AndroidDriver driver;

    public void select(String text) {
        searchField.sendKeys(text);
        firstResult.click();
    }
}
