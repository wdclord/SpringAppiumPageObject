package content.pages;


import framework.page.AbstractPage;
import framework.page.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page
public class TutorialPage extends AbstractPage {


    @FindBy(id = "com.revolut.revolut.test:id/header_next")
    private WebElement skipButton;

    @FindBy(id = "com.revolut.revolut.test:id/next_button")
    private WebElement continueButton;


    public void gotoLoginPage() {
        skipButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

}

