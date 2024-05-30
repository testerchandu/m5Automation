package with_operators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class perform_login_operation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get( "https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement email =driver.findElement( By.name("email"));
		email.sendKeys( "nagachandu0649",Keys.TAB,"chandu123",Keys.TAB,Keys.ENTER);
	}
	}