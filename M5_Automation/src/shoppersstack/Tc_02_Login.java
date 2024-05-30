package shoppersstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom_pages.Welcome_page;

public class Tc_02_Login {
	@Test()
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		class Welcome_page {
			//step2-->create a parametrized constructor
			public Welcome_page(WebDriver driver) {
				//step4---> initilize the webelement
				PageFactory.initElements( driver, this);
			}
			//step3--> identify webelement
			@FindBy(id="loginBtn")
			private WebElement login_Button;
			public WebElement getLogin_Button() {
				return login_Button;
			}
			}
		Welcome_page welcome=new Welcome_page(driver);
		welcome.getLogin_Button().click();
		// click on login btn
		/*driver.findElement(By.id("loginBtn")).click();
		 * 
		// email
		driver.findElement(By.id("Email")).sendKeys("nagachandu06@gmail.com");
		//pasw
		driver.findElement(By.id("Password")).sendKeys("Chandu@123");
		driver.findElement(By.id("Login")).click();*/
		
	}

}
