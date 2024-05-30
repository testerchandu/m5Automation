package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class use_of_cssselector {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to( "https://www.facebook.com/");
	driver.findElement( By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys( "chandu@1233.com");
	//for login
	driver.findElement( By.cssSelector("button[type='submit']"));
	Thread.sleep(1000);
	driver.quit();

}
}