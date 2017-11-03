package Suits;

import framework.FrameworkConfiguration;
//import framework.SeleniumTestExecutionListener;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FrameworkConfiguration.class})
//@TestExecutionListeners({SeleniumTestExecutionListener.class, DependencyInjectionTestExecutionListener.class})
public abstract class Suite {

    @Autowired
    private AndroidDriver driver;

    @Before
    public void setup() {
        driver.resetApp();
    }

}
