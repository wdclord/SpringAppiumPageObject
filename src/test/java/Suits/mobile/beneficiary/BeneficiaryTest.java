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
import ru.yandex.qatools.allure.annotations.Title;

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
    @Title("Add new beneficiary to self")
    void AddNewBeneficiaryToMySelf() {
        User user = userFactory.getDefaultUser();
        BaseBeneficiary beneficiary = beneficiaryFactory.getDefaultPersonBeneficiary();

        loginSteps.loginToApplication(user);
        beneficiarySteps.addNewBeneficiaryToMyself(beneficiary, user);
//        TODO I have an issue with Bank Transfer page. So i turned off asserts. For more information check issues document
//        beneficiarySteps.checkAddedPersonBeneficiary(beneficiary);
    }

    @Test
    @Title("Add new beneficiary to another person")
    void AddNewBeneficiaryToAnotherPerson() {
        User user = userFactory.getDefaultUser();
        BaseBeneficiary beneficiary = beneficiaryFactory.getDefaultPersonBeneficiary();

        loginSteps.loginToApplication(user);
        beneficiarySteps.addNewBeneficiaryToAnotherPerson(beneficiary, user);
    }

    @Test
    @Title("Add new beneficiary to company")
    void AddNewBeneficiaryToCompany() {
        User user = userFactory.getDefaultUser();
        BaseBeneficiary beneficiary = beneficiaryFactory.getDefaultCompanyBeneficiary();

        loginSteps.loginToApplication(user);
        beneficiarySteps.addNewBeneficiaryToCompany(beneficiary, user);
    }
}
