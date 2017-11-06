package content.pages.beneficiary;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class CountryAndCurrencyPage extends AbstractPage {

    @AndroidFindBy(xpath = "")
    private WebElement countrySelector;
    @AndroidFindBy(xpath = "")
    private WebElement currencySelector;

    public void tapCountrySelector(){
        countrySelector.click();
    }

    public void tapCurrencySelector(){
        currencySelector.click();
    }

}
