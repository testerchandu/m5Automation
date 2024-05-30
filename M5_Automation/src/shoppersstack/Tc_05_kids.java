package shoppersstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_05_kids {
	@Test()
	public void kids() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(12000);
		// click on login btn
		driver.findElement(By.id("loginBtn")).click();
		
		// email
		driver.findElement(By.id("Email")).sendKeys("yugendarch@gmail.com");
		//pasw
		driver.findElement(By.id("Password")).sendKeys("Yugendar@16");
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		//kids
		driver.findElement(By.xpath("//a[@name='kids']")).click();
	    driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='santoor']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ProductDisplay_productTitle__TcJCZ')]/../div[1]/h2")).click();
		driver.quit();
	}

}
