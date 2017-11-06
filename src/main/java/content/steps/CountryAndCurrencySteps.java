package content.steps;

import content.pages.beneficiary.CountryAndCurrencyPage;
import content.pages.selectors.CountrySelectorPage;
import content.pages.selectors.CurrencySelectorPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryAndCurrencySteps {

    @Autowired
    private CountryAndCurrencyPage countryAndCurrencyPage;
    @Autowired
    private CountrySelectorPage countrySelectorPage;
    @Autowired
    private CurrencySelectorPage currencySelectorPage;

    public CountryAndCurrencySteps openCountrySelector() {
        countryAndCurrencyPage.tapCountrySelector();
        return this;
    }

    public CountryAndCurrencySteps selectCountry(String country) {
        countrySelectorPage.select(country);
        return this;
    }

    public CountryAndCurrencySteps openCurrencySelector() {
        countryAndCurrencyPage.tapCurrencySelector();
        return this;
    }

    public CountryAndCurrencySteps selectCurrency(String currency) {
        currencySelectorPage.select(currency);
        return this;
    }

    public void clickNextButton() {
        countryAndCurrencyPage.tapNextButton();
    }
}
