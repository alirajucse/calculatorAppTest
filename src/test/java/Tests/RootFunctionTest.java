package Tests;

import Bases.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RootFunctionTest {
    AndroidDriver driver;
    Base ob = new Base();

    @Test
    public void rootOfANumberTest(){
        ob.launchTheApp();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_root")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_4")).click();
        driver.findElement(By.id("com.simplemobiletools.calculator:id/btn_equals")).click();
        String result= driver.findElement(By.id("com.simplemobiletools.calculator:id/result")).getText();
        System.out.println("Result is:" +result);
        Assert.assertEquals(result,"2");
    }

}
