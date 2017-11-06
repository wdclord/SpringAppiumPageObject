package Suits.mobile.beneficiary;


import Suits.BaseTest;
import content.data.beneficiary.BaseBeneficiary;
import content.data.beneficiary.BeneficiaryFactory;
import content.data.user.User;
import content.data.user.UserFactory;
import content.steps.BeneficiarySteps;
import content.steps.LoginSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class BeneficiaryTest extends BaseTest {

    @Autowired
    private LoginSteps loginSteps;
    @Autowired
    private BeneficiarySteps beneficiarySteps;
    @Autowired
    private UserFactory userFactory;
    @Autowired
    private BeneficiaryFactory beneficiaryFactory;

    @Test
    void AddNewBeneficiaryToMySelf() {
        User user = userFactory.getDefaultUser();
        BaseBeneficiary beneficiary = beneficiaryFactory.getDefaultPersonBeneficiary();

        loginSteps.loginToApplication(user);
        beneficiarySteps.addNewBeneficiaryToMyself(beneficiary, user);
    }

    @Test
    void AddNewBeneficiaryToAnotherPerson() {
        User user = userFactory.getDefaultUser();
        BaseBeneficiary beneficiary = beneficiaryFactory.getDefaultPersonBeneficiary();

        loginSteps.loginToApplication(userFactory.getDefaultUser());
        beneficiarySteps.addNewBeneficiaryToAnotherPerson(beneficiary, user);
    }

    @Test
    void AddNewBeneficiaryToCompany() {
        User user = userFactory.getDefaultUser();
        BaseBeneficiary beneficiary = beneficiaryFactory.getDefaultPersonBeneficiary();

        loginSteps.loginToApplication(userFactory.getDefaultUser());
        beneficiarySteps.addNewBeneficiaryToCompany(beneficiary, user);
    }
}
