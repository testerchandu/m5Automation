package shoppersstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Tc_03_men {
	@Test()
	public void men() throws InterruptedException
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		//Thread.sleep(12000);
		//step-->create class same as webpage name
		class menmodule {
			//step2-->create a parametrized constructor
			public menmodule (WebDriver driver) {
				//step4---> initilize the webelement
				PageFactory.initElements( driver, this);
			}
			//step3--> identify webelement
			@FindBy (name="men")
			private WebElement click_Button;
			public WebElement getLogin_Button() {
				return click_Button;
			}
			}

		// click on login btn
		
		driver.findElement(By.id("loginBtn")).click();
		
		// email
		driver.findElement(By.id("Email")).sendKeys("nagachandu0649@gmail.com");
		//pasw
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);
		// men
		driver.findElement(By.xpath("//a[@name='men']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='levis'][1]")).click();
		driver.quit();
		//driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		//driver.quit();*/
	}

}
