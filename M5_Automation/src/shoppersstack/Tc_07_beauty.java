package shoppersstack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_07_beauty {
	@Test()
	public void beauty() throws InterruptedException
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		 
		// click on login btn
		driver.findElement(By.id("loginBtn")).click();
		
		// email
		driver.findElement(By.id("Email")).sendKeys("nagachandu0649@gmail.com");
		// pasw
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		// beauty
		driver.navigate().refresh();
		driver.findElement(By.id("beautyProducts")).click();
		
		List<WebElement>allpersentages=driver.findElements(By.xpath("//span[contains(text(),'Lakme Forever Matte Lipstick')]/../../../div[3]/div[1]/div[1]/p/span[3]"));
		   for (WebElement persentage: allpersentages)
		   {
			   System.out.println(persentage.getText());
			   
		   }
		driver.quit();	
			
		
	}
}
