package Suits;

import framework.FrameworkConfiguration;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {FrameworkConfiguration.class})
public abstract class BaseTest {

    @Autowired
    private AndroidDriver driver;

    @AfterEach
    public void cleanup() {
//        driver.resetApp();
    }

}
