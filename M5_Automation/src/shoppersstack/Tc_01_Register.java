package shoppersstack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_01_Register {
	@Test()
	public void register() throws InterruptedException, IOException
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		// step-1 ---> get an object of external file
				FileInputStream fis=new FileInputStream("./commondata/m5login.properties");
		      //  step-2 ---> create an object for properties
		 		Properties prop=new Properties();
			 //  step-3 --->  load the file
				prop.load(fis);
			 // step-4 ---> read the data
			    String url=prop.getProperty("url");
			  //  System.out.println(url);
		driver.get(url);
		Thread.sleep(4000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Create Account")).click();
		driver.findElement(By.id("First Name")).sendKeys("naga");
		driver.findElement(By.id("Last Name")).sendKeys("borra");
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("8328389646");
		driver.findElement(By.id("Email Address")).sendKeys("nagachandu0649@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		driver.findElement(By.id("Confirm Password")).sendKeys("Chandu@123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();
		driver.quit();
	}
}