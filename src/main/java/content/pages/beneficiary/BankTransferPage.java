package content.pages.beneficiary;

import content.fragments.BeneficiaryBlock;
import framework.page.AbstractPage;
import framework.page.Page;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Page
public class BankTransferPage extends AbstractPage {

//    TODO These locator do not work
//    @AndroidFindBy(id = "com.revolut.revolut.test:id/list_add_new_item_text")
//    private WebElement addNewBeneficiaryButton;
//
//    public void tapAddNewBeneficiaryButton() {
//        addNewBeneficiaryButton.click();
//    }

    @Autowired
    private AndroidDriver driver;

    public void tapAddNewBeneficiaryButton(){

//        System.out.println("Page source on Bank Transfer page" +driver.getPageSource());

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(400,625).perform();

    }


//    @AndroidFindAll({
//            @AndroidBy(id = "com.revolut.revolut.test:id/item_text_content")
//    })
    private List<BeneficiaryBlock> beneficiaryBlockList;

    @Autowired
    private BeneficiaryBlock beneficiaryBlock;

    public BeneficiaryBlock getFirstBeneficiaryBlock(){

        return beneficiaryBlock = beneficiaryBlockList.get(0);
    }

}
