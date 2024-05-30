package shoppers_stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_02_Login {
	WebDriver driver;
	@Test(groups="functional")
	@Parameters("browser")
	public void login(String browser) throws InterruptedException, IOException {
		//WebDriver driver=new ChromeDriver();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase( "edge"))
		{
			driver=new EdgeDriver();
		} 
		FileInputStream fis=new FileInputStream("./commondata/m5login.properties");
		//step2-->create obj for properties
		Properties prop=new Properties();
		//step3-->load the file
		prop.load(fis);
		//step4--->read the data
		String url = prop.getProperty("url");
		
		driver.get( url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys( "nagachandu0649@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		driver.findElement(By.id("Login")).click();	
		driver.quit();
	}
	}