package content.steps;

import content.data.beneficiary.BaseBeneficiary;
import content.pages.beneficiary.accountdetails.CompanyAccountDetails;
import content.pages.beneficiary.accountdetails.PersonAccountDetailsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDetailsSteps {

    @Autowired
    PersonAccountDetailsPage personAccountDetailsPage;

    @Autowired
    CompanyAccountDetails companyAccountDetails;

    public void fillIntoMyselfAccountDetails(BaseBeneficiary beneficiary) {
        personAccountDetailsPage
                .enterAccountNumber(beneficiary.getAccountNUmber())
                .enterSortCode(beneficiary.getSortCode())
                .enterPhoneNumber(beneficiary.getPhoneNumber())
                .enterEmailAddress(beneficiary.getEmailAddress())
                .tapNextButton();
    }
    public void fillIntoAnotherPersonAccountDetails(BaseBeneficiary beneficiary) {
        personAccountDetailsPage
                .enterFirstName(beneficiary.getFirstName())
                .enterLastName(beneficiary.getLastName())
                .enterAccountNumber(beneficiary.getAccountNUmber())
                .enterSortCode(beneficiary.getSortCode())
                .enterPhoneNumber(beneficiary.getPhoneNumber())
                .enterEmailAddress(beneficiary.getEmailAddress())
                .tapNextButton();
    }

    public void fillIntoCompanyAccountDetails(BaseBeneficiary beneficiary) {
        companyAccountDetails
                .enterCompanyName(beneficiary.getCompanyName())
                .enterAccountNumber(beneficiary.getAccountNUmber())
                .enterSortCode(beneficiary.getSortCode())
                .enterPhoneNumber(beneficiary.getPhoneNumber())
                .enterEmailAddress(beneficiary.getEmailAddress())
                .tapNextButton();

    }

}
