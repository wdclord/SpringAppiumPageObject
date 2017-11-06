package framework;

import content.data.beneficiary.CompanyBeneficiary;
import content.data.beneficiary.PersonBeneficiary;
import content.data.user.User;
import framework.page.Page;
import io.appium.java_client.android.AndroidDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static framework.driver.DriverFactory.getAndroidDriver;

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
    public AndroidDriver androidDriver() {
        System.out.println("ALLLLLLLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOOOOOOOOOOOooooooooooooooooooooooooooooooooooOOOOOOOOOOOO");
        return getAndroidDriver();
    }

}
