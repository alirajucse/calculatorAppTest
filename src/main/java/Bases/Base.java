package Bases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    static AndroidDriver driver;

    public void launchTheApp(){
        try{
            openCalculatorApp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public static void openCalculatorApp() throws MalformedURLException {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("udID","NE1GAM4781909253");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9.0");
        cap.setCapability("deviceName","Nokia 3");
        cap.setCapability("app","D:\\calculator-fdroid-release.apk");
        cap.setCapability("automationName","uiAutomator2");
        cap.setCapability("newCommandTimeout", "45000");
        cap.setCapability("noReset",true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println("App launched");
    }
}
