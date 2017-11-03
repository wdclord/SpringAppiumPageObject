package content.pages.skip;

import framework.page.Page;

@Page
public class EnableInstantMoneyTransfersPage extends BaseSkipPage {

    @Override
    public void skipPage() {
        skipButton.click();
    }

    @Override
    public void clickContinueButton() {
        continueButton.click();
    }
}
