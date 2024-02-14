package org.Bridgelabz.Calculator_Test_Virtual_App;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
public class CalculatorTest_VirtualDevice {
    public AndroidDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName","emulator-5554");
        dc.setCapability("platformVersion","9.0");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }

    @Test
    public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
        WebElement two=driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        two.click();
        WebElement plus=driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();
        WebElement four=driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        four.click();
        WebElement minus=driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        minus.click();
        WebElement thr=driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        thr.click();
        //equal button
        WebElement equalTo=driver.findElement(By.id("com.android.calculator2:id/eq"));
        equalTo.click();
        //locate the edit box of the calculator by using By.tagName()
        WebElement results=driver.findElement(By.id("com.android.calculator2:id/result"));
        //Check the calculated value on the edit box
        Assert.assertEquals(results.getText(),"8");

    }
}
