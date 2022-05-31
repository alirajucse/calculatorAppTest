package Tests;

import Bases.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest {
    AndroidDriver driver;
    Base ob = new Base();

    @Test
    public void subtractInteger(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_7")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_minus")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"2");
    }

    @Test
    public void subtractUsingFractionNumber(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_7")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_decimal")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_minus")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_decimal")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_7")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"1.8");
    }
}
