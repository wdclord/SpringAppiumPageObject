package content.data.beneficiary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeneficiaryFactory {

    @Autowired
    private PersonBeneficiary personBeneficiary;

    @Autowired
    private CompanyBeneficiary companyBeneficiary;

    public BaseBeneficiary getDefaultPersonBeneficiary() {
        return personBeneficiary
                .setFirstName("Maxim")
                .setLastName("Bugrov")
                .setCountry("United Kingdom")
                .setCurrency("GBP")
                .setAccountNUmber("12344321")
                .setSortCode("123321")
                .setPhoneNumber("+79119898472")
                .setEmailAddress("stalkerirusi@mail.ru");
    }

    public BaseBeneficiary getDefaultCompanyBeneficiary() {
        return companyBeneficiary
                .setCompanyName("MyCompany")
                .setCountry("United Kingdom")
                .setCurrency("GBP")
                .setAccountNUmber("12344321")
                .setSortCode("123321")
                .setPhoneNumber("+79119898472")
                .setEmailAddress("stalkerirusi@mail.ru");
    }

}
