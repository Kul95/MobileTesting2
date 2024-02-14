package org.Bridgelabz.Amazon_WebApp_Testing;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class Amazon_Web_App_Testing {
    public AndroidDriver driver;
    public void setupa() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("platformVersion", "9.0");
        dc.setCapability("browserName", "chrome");
        dc.setCapability("chromeOptions", Collections.singletonMap("w3c", false));
        dc.setCapability("chromedriverExecutable", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        Thread.sleep(2000);
        System.out.println("It is Starting");
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.name("k"));
        ele.sendKeys("Iphone 11");
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (256GB) - Purple']")).click();
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        for (int i = 0; i <= 5; i++) {
            executor.executeScript("window.scrollBy(0,100)");
        }
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(2000);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        for (int i = 0; i <= 5; i++) {
            executor.executeScript("window.scrollBy(0,100)");
        }
    }

    @Test
    public void amazonTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("https://www.amazon.in");
        WebElement search = driver.findElement(By.name("k"));
        search.sendKeys("Redmi note 13 Pro");
        Thread.sleep(2000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        JavascriptExecutor javascriptExecutor = driver;
        javascriptExecutor.executeScript("window.scrollTo(0,600)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        javascriptExecutor.executeScript("window.scrollTo(0,1500)");
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
        TouchAction action=new TouchAction(driver);
        action.tap(PointOption.point(1277, 743)).perform();
        Thread.sleep(3000);
        javascriptExecutor.executeScript("window.scrollTo(0,-1500)");
        Thread.sleep(3000);
        action.tap(PointOption.point(1306, 348)).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-button-cart']")).click();
        Thread.sleep(2000);

    }
}
