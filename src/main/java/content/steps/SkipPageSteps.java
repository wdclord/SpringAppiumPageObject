package content.steps;

import content.pages.skip.EnableAdditionalSecurityPage;
import content.pages.skip.EnableInstantMoneyTransfersPage;
import content.pages.skip.TutorialPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SkipPageSteps {

    @Autowired
    TutorialPage tutorialPage;
    @Autowired
    EnableInstantMoneyTransfersPage enableInstantMoneyTransfersPage;
    @Autowired
    EnableAdditionalSecurityPage enableAdditionalSecurityPage;

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

}
