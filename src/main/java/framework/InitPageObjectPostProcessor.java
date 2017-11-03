package framework;

import framework.page.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitPageObjectPostProcessor implements BeanPostProcessor {

    @Autowired
    private AndroidDriver driver;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Page.class)) {
            PageFactory.initElements(new AppiumFieldDecorator(driver), bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        return bean;
    }
}
