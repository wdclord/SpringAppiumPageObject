package framework.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public enum Mobile {
    ANDROID {
        @Override
        AndroidDriver getDriver() {
            try {
                File appDir = new File("src/Revolut_QA.4.7.0.796.apk");
                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                DesiredCapabilities capabilities = DesiredCapabilities.android();
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.revolut.*");

                return new AndroidDriver(url, capabilities);
            } catch (MalformedURLException e) {
                System.out.printf("Incorrect format of Appium server URL");
                return null;
            }
        }
    },
    ANDROID_NO_RESET {
        @Override
        AndroidDriver getDriver() {
            try {
                File appDir = new File("src/Revolut_QA.4.7.0.796.apk");
                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                DesiredCapabilities capabilities = DesiredCapabilities.android();
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");

                return new AndroidDriver(url, capabilities);
            } catch (MalformedURLException e) {
                System.out.printf("Incorrect format of Appium server URL");
                return null;
            }
        }
    };


    abstract AndroidDriver getDriver();
}
