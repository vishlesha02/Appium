package com.bridgelabz;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator{
        public AndroidDriver driver;
        @BeforeMethod
        public void setUp() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.android.calculator2");
            capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
            capabilities.setCapability("platformVersion", "9.0");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }

        @Test
        public void add()
        {
            driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("plus")).click();
            driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("equals")).click();
        }
        @Test
        public void subtract()
        {
            driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("minus")).click();
            driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("equals")).click();
        }
        @Test
        public void multiplication()
        {
            driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("multiply")).click();
            driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("equals")).click();
        }
        @Test
        public void division()
        {
            driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("divide")).click();
            driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("equals")).click();
        }

}
