package shoppers_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_04_Women {
	@Test(groups="end")
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/user-signin");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	   //driver.findElement(By.id("Email")).click();
	   driver.findElement(By.id("Email")).sendKeys( "nagachandu0649@gmail.com");
	   //driver.findElement(By.id("Password")).click();
	   driver.findElement(By.id("Password")).sendKeys( "Chandu@123");
	   driver.findElement(By.xpath("//button[@id='Login']")).click();
	   Thread.sleep(5000); 
	   driver.findElement(By.xpath(" //a[@id='women']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath( "//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]")).click();
	   driver.quit();
	}
	}