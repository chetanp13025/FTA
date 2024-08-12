package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import properties.Properties;

public class Fta_web extends Properties{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
//public static void web() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://qa-fta.web.app");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("abhiasm1@yopmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("blubirch123");
	driver.findElement(By.tagName("//ion-button[@class='footer md button button-block button-solid ion-activatable ion-focusable hydrated']")).click();
}
}
