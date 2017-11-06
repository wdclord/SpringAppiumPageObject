package Suits;

import framework.FrameworkConfiguration;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.TimeUnit;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {FrameworkConfiguration.class})
public abstract class BaseTest {

    @Autowired
    private AndroidDriver driver;

    @BeforeEach
    public void setup(){
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @AfterEach
    public void cleanup() {
//        driver.resetApp();
    }

}
