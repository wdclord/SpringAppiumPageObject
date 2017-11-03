package framework.driver;

import io.appium.java_client.android.AndroidDriver;

public class DriverPool {
    public AndroidDriver getDriver(){

        Mobile mobile = Mobile.ANDROID_7_1_1;
        return mobile.getDriver();
    }
}
