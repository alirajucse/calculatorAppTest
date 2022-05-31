package Tests;

import Bases.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest {
    AndroidDriver driver;
    Base ob = new Base();

    @Test
    public void multiplicationTestUsingInteger(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_4")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_multiply")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_2")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"8");
    }

    @Test
    public void multiplicationTestUsingUsingFractionNumber(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_7")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_decimal")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_multiply")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_decimal")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_7")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"42.75");
    }
}
