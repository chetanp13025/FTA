package web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMaster {
	@Test
	public static void user() throws InterruptedException, IOException {
		String filePath="C:\\Users\\Blubirch\\Downloads\\usermaster.csv";
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa-rims-k8s.blubirch.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("chetanpatil1@blubirch.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Chetanp@123");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("(//img[@class='mt-3'])[13]")).click();
		driver.findElement(By.xpath("(//img[@class='mt-3'])[2]")).click();
		driver.findElement(By.xpath("(//img[@class='mt-3'])[7]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[.='Upload']")).click();
		driver.findElement(By.xpath("//span[.='Upload']")).click();
		driver.findElement(By.xpath("//div[@class='v-file-input__text']")).click();
		Thread.sleep(500);
//		String absolutePath = System.getProperty("user.dir") + "\\" + filePath;
		Runtime.getRuntime().exec("C://autoitfiles/fileupload.exe" + " " + filePath);
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.='Confirm']")).click();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		
	}
}
