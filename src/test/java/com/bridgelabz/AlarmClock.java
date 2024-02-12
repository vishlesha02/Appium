package com.bridgelabz;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AlarmClock {
        public AndroidDriver driver;
        @BeforeMethod
        public void setUp() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.google.android.deskclock");
            capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");
            capabilities.setCapability("platformVersion", "9.0");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        }

        @Test
        public void alarm()
        {
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]/android.widget.TextView")).click();
            driver.findElement(By.id("com.google.android.deskclock:id/digital_clock")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("30")).click();
            driver.findElement(By.id("android:id/am_label")).click();
            driver.findElement(By.id("android:id/button1")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Wednesday")).click();

        }

}
