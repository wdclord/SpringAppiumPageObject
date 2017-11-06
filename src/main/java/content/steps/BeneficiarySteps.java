package content.steps;

import content.data.beneficiary.BaseBeneficiary;
import content.data.user.User;
import content.pages.beneficiary.TransferTypePage;
import content.pages.login.PassCodePage;
import content.pages.login.SmsCodePage;
import content.pages.skip.BeneficiarySuccessfullPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;

@Component
public class BeneficiarySteps {


    @Autowired
    private BankTransferSteps bankTransferSteps;
    @Autowired
    private TransferTypePage transferTypePage;
    @Autowired
    private CountryAndCurrencySteps countryAndCurrencySteps;
    @Autowired
    private AccountDetailsSteps accountDetailsSteps;
    @Autowired
    private PassCodePage passCodePage;
    @Autowired
    private SmsCodePage smsCodePage;
    @Autowired
    private BeneficiarySuccessfullPage beneficiarySuccessfullPage;

    @Step("Add new beneficiary to self")
    public void addNewBeneficiaryToMyself(BaseBeneficiary beneficiary, User user) {
        bankTransferSteps.openNewBeneficiaryPage();
        transferTypePage.selectTransferTypeToMyself();
        countryAndCurrencySteps
                .openCountrySelector().selectCountry(beneficiary.getCountry())
                .openCurrencySelector().selectCurrency(beneficiary.getCurrency())
                .clickNextButton();
        accountDetailsSteps.fillIntoMyselfAccountDetails(beneficiary);
        passCodePage.enterPasscode(user.getPasscode());
        smsCodePage.enterSmsCode();
        beneficiarySuccessfullPage.clickContinueButton();
    }

    @Step("Add new beneficiary to another person")
    public void addNewBeneficiaryToAnotherPerson(BaseBeneficiary beneficiary, User user) {
        bankTransferSteps.openNewBeneficiaryPage();
        transferTypePage.selectTransferTypeToAnotherPerson();
        countryAndCurrencySteps
                .openCountrySelector().selectCountry(beneficiary.getCountry())
                .openCurrencySelector().selectCurrency(beneficiary.getCurrency())
                .clickNextButton();
        accountDetailsSteps.fillIntoAnotherPersonAccountDetails(beneficiary);
        passCodePage.enterPasscode(user.getPasscode());
        smsCodePage.enterSmsCode();
        beneficiarySuccessfullPage.clickContinueButton();
    }

    @Step("Add new beneficiary to company")
    public void addNewBeneficiaryToCompany(BaseBeneficiary beneficiary, User user) {
        bankTransferSteps.openNewBeneficiaryPage();
        transferTypePage.selectTransferTypeToCompany();
        countryAndCurrencySteps
                .openCountrySelector().selectCountry(beneficiary.getCountry())
                .openCurrencySelector().selectCurrency(beneficiary.getCurrency())
                .clickNextButton();
        accountDetailsSteps.fillIntoCompanyAccountDetails(beneficiary);
        passCodePage.enterPasscode(user.getPasscode());
        smsCodePage.enterSmsCode();
        beneficiarySuccessfullPage.clickContinueButton();
    }
    @Step("Verifying properties of added beneficiary")
    public void checkAddedPersonBeneficiary(BaseBeneficiary beneficiary) {
        String fullName = beneficiary.getFirstName() + " " + beneficiary.getLastName();
        assertThat("Full name does not match expected", bankTransferSteps.checkFullName(fullName));
        assertThat("Currency does not match expected", bankTransferSteps.checkCurrency(beneficiary.getCurrency()));
        assertThat("Account number does not match expected", bankTransferSteps.checkAccountNumber(beneficiary.getAccountNUmber()));
        assertThat("Sort code does not match expected", bankTransferSteps.checkSortCode(beneficiary.getSortCode()));
    }
}
