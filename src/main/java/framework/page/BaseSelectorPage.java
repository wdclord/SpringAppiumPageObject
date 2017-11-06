package framework.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseSelectorPage extends AbstractPage {

    @AndroidFindBy(id = "com.revolut.revolut.test:id/search_src_text")
    private WebElement searchField;

    //TODO
    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement firstResult;
//
//    @Autowired
//    private AndroidDriver driver;

    public void select(String text) {
        searchField.sendKeys(text);
//        TODO
//        System.out.println("SOURCE BEFORE CLICK "+driver.getPageSource());
        firstResult.click();
//        System.out.println("SOURCE AFTER CLICK "+driver.getPageSource());
        try{Thread.sleep(2000);}catch (InterruptedException e){
            System.out.println(e.toString());
        }
    }
}
