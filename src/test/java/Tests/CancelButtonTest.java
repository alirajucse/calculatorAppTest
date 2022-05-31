package Tests;

import Bases.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CancelButtonTest {
    AndroidDriver driver;
    Base ob = new Base();

    @Test
    public void testCButton(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_7")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_plus")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_5")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_clear")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_clear")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"7");
    }

}
