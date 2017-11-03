package framework.driver;

import io.appium.java_client.android.AndroidDriver;

public class DriverPool {
    public static AndroidDriver getAndroidDriver(){

        Mobile mobile = Mobile.ANDROID;
        return mobile.getDriver();
    }
}
