package org.Bridgelabz.Calculator_Real_App;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorReal_App_Testing {
    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc2 = new DesiredCapabilities();
        dc2.setCapability("platformName", "Android");
        dc2.setCapability("deviceName", "realme C35");
        dc2.setCapability("platformVersion", "9.0");
        dc2.setCapability("appPackage", "com.google.android.calculator");
        dc2.setCapability("appActivity", "com.android.calculator2.Calculator");
        dc2.setCapability("udid", "0G02823R22003407");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc2);
        System.out.println("It is Starting");
    }

    @Test
    public void calculator() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();

    }
}
