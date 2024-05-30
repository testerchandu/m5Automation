package shoppers_stack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_06_electronics {
	@Test(groups="smoke")
	public void login() throws AWTException, InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/user-signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id( "Email")).sendKeys("nagachandu0649@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		 driver.findElement(By.xpath("//button[@id='Login']")).click();
		   Thread.sleep(5000); 
		driver.findElement(By.xpath( "//a[@id='electronics']")).click();
		driver.navigate().refresh();
		 List<WebElement> allpr = driver.findElements(By.xpath("//span[contains(text(),'SAMSUNG Galaxy Z Flip4')]"));
		//List<WebElement> allpr = driver.findElements(By.xpath("//a"));
		for(WebElement alnames:allpr) {
			//System.out.println(alnames.getText());
			Reporter.log( alnames.getText(), true);
			driver.quit();
		}
	}
	}
