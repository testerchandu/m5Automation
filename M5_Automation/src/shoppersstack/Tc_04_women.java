package shoppersstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_04_women {
	@Test()
	public void women() throws InterruptedException 
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
		//women
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@name='women']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='forever21'][1]")).click();
		driver.findElement(By.xpath("//button[@type='button'][1]")).click();
		driver.quit();
	}
}
