package shoppers_stack;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_07_beauti {
	@Test(groups="sanity")
	public void login() throws AWTException, InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id( "Email")).sendKeys("nagachandu0649@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("beautyProducts")).click();
		List<WebElement> allof = driver.findElements(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/span[3]"));
		//List<WebElement> allof = driver.findElements(By.xpath("//div[@class='featuredProducts_cardBody__gWfky']/../div/div[1]/span"));
		 for(WebElement off:allof) {
			 //System.out.println(off.getText());
			 Reporter.log( "off", true);
			 driver.quit();
			 
		 }
}
}