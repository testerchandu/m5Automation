package shoppers_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_05_kids {
	@Test(groups="smoke")
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/user-signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("Email")).click();
		   driver.findElement(By.id("Email")).sendKeys( "nagachandu0649@gmail.com");
		   driver.findElement(By.id("Password")).click();
		   driver.findElement(By.id("Password")).sendKeys( "Chandu@123");
		   driver.findElement(By.xpath("//button[@id='Login']")).click();
		   Thread.sleep(5000); 
		   driver.findElement(By.xpath("//a[@id='kids']")).click();//a[@id='kids']
		   Thread.sleep(5000);
		   WebElement ap = driver.findElement(By.xpath( "//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/span[1]"));
		  System.out.println(ap.getText());  
		   driver.quit();
		}
		}
		 