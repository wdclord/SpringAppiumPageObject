package framework.page;

import io.appium.java_client.android.AndroidDriver;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractPage {

    @Autowired
    private AndroidDriver driver;

    protected String getPageSource() {
        return driver.getPageSource();
    }
}
