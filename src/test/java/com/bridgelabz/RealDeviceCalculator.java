package com.bridgelabz;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RealDeviceCalculator {
        public AndroidDriver driver;
        @BeforeTest
        public void setUp() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Galaxy M42 5G");
            capabilities.setCapability("udid", "RZCR403W3VW");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
            capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
            capabilities.setCapability("platformVersion","13");
            driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
        @Test
        public void add()
        {
            driver.findElement(new AppiumBy.ByAccessibilityId("9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Plus")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("1")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Equal")).click();
        }
        @Test
        public void substracion()
        {
            driver.findElement(new AppiumBy.ByAccessibilityId("5")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Minus")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("1")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Equal")).click();
        }
        @Test
        public void multiplication()
        {
            driver.findElement(new AppiumBy.ByAccessibilityId("3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Multiplication")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("2")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Equal")).click();
        }
        @Test
        public void division()
        {
            driver.findElement(new AppiumBy.ByAccessibilityId("9")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Division")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Equal")).click();
        }
        @Test
        public void bdmsa()
        {
            driver.findElement(new AppiumBy.ByAccessibilityId("Brackets")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("1")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("0")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Division")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("5")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Multiplication")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("2")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Minus")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("2")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Plus")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("3")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Brackets")).click();
            driver.findElement(new AppiumBy.ByAccessibilityId("Equal")).click();

        }


}
