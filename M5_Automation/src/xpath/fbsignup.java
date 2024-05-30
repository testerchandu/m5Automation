package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbsignup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys( "chandu");
	driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys( "borra");
	driver.findElement(By.xpath( " //label[text()='Male']")).click();
	driver.findElement(By.xpath("//input[@type ='radio'])[2]")).click();
	driver.findElement(By.xpath(" //input[@type='radio']")).click();
}
}
