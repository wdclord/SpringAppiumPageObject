package content.pages.beneficiary;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class CountryAndCurrencyPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/edit_country")
    private WebElement countrySelector;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/edit_currency")
    private WebElement currencySelector;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/button_next")
    private WebElement nextButton;

    public void tapCountrySelector() {
        countrySelector.click();
    }

    public void tapCurrencySelector() {
        currencySelector.click();
    }

    public void tapNextButton() {
        nextButton.click();
    }

}
