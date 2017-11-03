package content.pages;


import framework.page.Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

@Page
public class CountryCodeSelectorPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/search_src_text")
    private WebElement searchField;

    @AndroidFindBy(xpath = "//*[contains(@text,'United Kingdom')]")
    private WebElement unitedKingdom;

    public CountryCodeSelectorPage enterCountryCode(String countryCode) {
        searchField.sendKeys(countryCode);
        return this;
    }

    public void selectUnitedKingdom() {
        unitedKingdom.click();
    }

}
