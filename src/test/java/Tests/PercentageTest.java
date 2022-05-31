package Tests;

import Bases.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PercentageTest {
    AndroidDriver driver;
    Base ob = new Base();

    @Test
    public void perventageOfANumberTest(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_multiply")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_2")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_percent")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"0.1");
    }

}
