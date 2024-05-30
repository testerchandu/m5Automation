package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class complete_attribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to( "https://www.facebook.com/signup");
	driver.findElement( By.xpath("//input[@name='firstname']")).sendKeys( "nagachandu");
	driver.findElement( By.xpath( "//input[@name='lastname']")).sendKeys("borra");
	driver.findElement( By.xpath( "//a[text()='Already have an account?']")).click();
	driver.findElement( By.cssSelector("button[type='submit']")).click();
	Thread.sleep( 1000);
}
}
