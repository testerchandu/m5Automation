package Shoppersstack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01_Register {
	@Test(groups="smoke")
	public void register() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./commondata/m5login.properties");
		//step2-->create obj for properties
		Properties prop=new Properties();
		//step3-->load the file
		prop.load(fis);
		//step4--->read the data
		String url = prop.getProperty("url");
		driver.get( url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath( "//span[contains(text(),'Create Account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id( "First Name")).sendKeys("naga");
		driver.findElement(By.id( "Last Name")).sendKeys("chandu");
		driver.findElement(By.name("Male")).click();
		driver.findElement(By.name( "Phone Number")).sendKeys( "1234567823");
		driver.findElement(By.id("Email Address")).sendKeys("nagachandu049@gmail.com");
		driver.findElement(By.id("Password")).sendKeys( "Chandu@123");
	    driver.findElement(By.id("Confirm Password")).sendKeys( "Chandu@123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();
		Reporter.log( "done");
		driver.quit();
	}
}
