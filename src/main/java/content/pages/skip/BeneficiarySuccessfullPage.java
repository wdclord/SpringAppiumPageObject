package content.pages.skip;

import framework.page.BaseSkipPage;
import framework.page.Page;

@Page
public class BeneficiarySuccessfullPage extends BaseSkipPage {
    @Override
    public void skipPage() {
        skipButton.click();
    }

    @Override
    public void clickContinueButton() {
        continueButton.click();
    }
}
