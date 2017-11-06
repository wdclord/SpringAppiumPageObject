package content.steps;

import content.pages.skip.EnableAdditionalSecurityPage;
import content.pages.skip.EnableInstantMoneyTransfersPage;
import content.pages.skip.TransferMoneyGloballyPage;
import content.pages.skip.TutorialPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SkipPageSteps {

    @Autowired
    private TutorialPage tutorialPage;
    @Autowired
    private EnableInstantMoneyTransfersPage enableInstantMoneyTransfersPage;
    @Autowired
    private EnableAdditionalSecurityPage enableAdditionalSecurityPage;
    @Autowired
    private TransferMoneyGloballyPage transferMoneyGloballyPage;

    public SkipPageSteps skipTutorialPage() {
        tutorialPage.skipPage();
        return this;
    }

    public SkipPageSteps skipEnableInstantMoneyTransfersPage() {
        enableInstantMoneyTransfersPage.skipPage();
        return this;
    }

    public SkipPageSteps skipEnableAdditionalSecurityPage() {
        enableAdditionalSecurityPage.skipPage();
        return this;
    }

    public SkipPageSteps skipTransferMoneyGloballyPage(){
        transferMoneyGloballyPage.skipPage();
        return this;
    }

}
