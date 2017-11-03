package framework;

import io.appium.java_client.android.AndroidDriver;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class SeleniumTestExecutionListener extends AbstractTestExecutionListener {

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        testContext.getApplicationContext().getBean(TestScope.class).reset();
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        testContext.getApplicationContext().getBean(AndroidDriver.class).quit();
    }
}
