package org.Bridgelabz.Alarm_Testing_Emulator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AlarmTesting {
    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities ds1 = new DesiredCapabilities();
        ds1.setCapability("platformName", "Android");
        ds1.setCapability("deviceName", "emulator-5554");
        ds1.setCapability("platformVersion", "9.0");
        ds1.setCapability("appPackage", "com.google.android.deskclock");
        ds1.setCapability("appActivity", "com.android.deskclock.DeskClock");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), ds1);
        System.out.println("It is Starting");
    }

    @Test
    public void alarm() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]/android.widget.TextView"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"8:30 AM Alarm\"]/android.widget.Switch"));
        ele1.click();
        WebElement ele2 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"8:30 AM Alarm\"]"));
        ele2.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.google.android.deskclock:id/delete")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"9:00 AM\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"12\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"25\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("Collapse alarm")).click();
    }
}
