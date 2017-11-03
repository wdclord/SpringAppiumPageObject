package framework;

import framework.driver.DriverPool;
import framework.driver.Mobile;
import framework.page.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = {"content"},
        includeFilters = @ComponentScan.Filter(Page.class),
        lazyInit = true)
public class FrameworkConfiguration {

    @Bean
    public InitPageObjectPostProcessor initPageObjectPostProcessor() {
        return new InitPageObjectPostProcessor();
    }

    @Bean
    @Scope("test")
    public AndroidDriver androidDriver() throws MalformedURLException {

        System.out.println("ALLLLLLLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOOOOOOOOOOOooooooooooooooooooooooooooooooooooOOOOOOOOOOOO");

        DesiredCapabilities capabilities = DesiredCapabilities.android();
        File appDir = new File("src/Revolut_QA.4.7.0.796.apk");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.revolut.ui.tutorial.TutorialActivity");
        return new AndroidDriver(url, capabilities);
    }

    @Bean
    public TestScope testScope() {
        return new TestScope();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
        Map<String, Object> scopes = new HashMap<>();
        scopes.put("test", testScope());
        scopeConfigurer.setScopes(scopes);
        return scopeConfigurer;
    }

}
