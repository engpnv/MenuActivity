package test.util;


import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {


    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){
        if(driver==null){
            criarDriver();
        }
        return driver;
    }

    private static void criarDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "85P7JJYDVKTKPJGM");
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:appPackage", "com.example.menuactivity");
        desiredCapabilities.setCapability("appium:appActivity", "com.example.menuactivity.MainActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        URL remoteUrl = null;
        try {
            remoteUrl = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    public static void finalizarDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
