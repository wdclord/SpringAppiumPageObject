package content.pages.beneficiary;

import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;

@Page
//@Scope("prototype")
public class CountryAndCurrencyPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/edit_country")
    private WebElement countrySelector;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/edit_currency")
    private WebElement currencySelector;
    @AndroidFindBy(id = "com.revolut.revolut.test:id/button_next")
    private WebElement nextButton;

//    @Autowired
//    private AndroidDriver driver;

    public void tapCountrySelector() {
//        TODO
//        System.out.println("PAGE SOURCE ON COUNTRY: "+driver.getPageSource());
//        System.out.println("TITLE ON COUNTRY: "+driver.get());
        countrySelector.click();
    }

    public void tapCurrencySelector() {
//        System.out.println("PAGE SOURCE ON CURRENCY: "+driver.getPageSource());
//        System.out.println("TITLE ON CURRENCY: "+driver.getTitle());
        currencySelector.click();
    }

    public void tapNextButton() {
        nextButton.click();
    }

}
