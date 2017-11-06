package content.steps;

import content.data.beneficiary.BaseBeneficiary;
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

    public void selectCountryAndCurrency(BaseBeneficiary beneficiary) {
        countryAndCurrencyPage.tapCountrySelector();
        countrySelectorPage.select(beneficiary.getCountry());

        countryAndCurrencyPage.tapCurrencySelector();
        currencySelectorPage.select(beneficiary.getCurrency());
    }
}
