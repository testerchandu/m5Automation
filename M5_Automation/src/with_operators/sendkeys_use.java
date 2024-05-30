package with_operators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sendkeys_use {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get( "https://www.flipkart.com/");
	//identify search testfield and pass data
	WebElement search =driver.findElement(By.name("q"));
	Thread.sleep(2000);
	search.sendKeys("realeme phones",Keys.ENTER);
	driver.quit();
}
}