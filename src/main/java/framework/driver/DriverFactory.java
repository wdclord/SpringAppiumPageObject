package framework.driver;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
    public static AndroidDriver getAndroidDriver() {

        Mobile mobile = Mobile.ANDROID;
        return mobile.getDriver();
    }
}
