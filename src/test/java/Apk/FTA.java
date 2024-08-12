package Apk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import properties.Properties;

public class FTA extends Properties {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//	pro();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "chetan");
		dc.setCapability("appPackage", "com.blubirch.fta");
		dc.setCapability("appActivity", "com.blubirch.fta.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//android.webkit.WebView[@text=\"FTA\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText"))
				.click();
		driver.findElement(By.xpath(
				"//android.webkit.WebView[@text=\"FTA\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText"))
				.sendKeys("abhiasm1@yopmail.com");
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.TAB));
		driver.findElement(By.xpath(
				"//android.webkit.WebView[@text=\"FTA\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText"))
				.sendKeys("blubirch123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']")).click();

	}
}