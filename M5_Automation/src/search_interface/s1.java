package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
driver.findElement(By.id("email")).sendKeys( "elek");
WebElement	pas =driver.findElement(By.id("pass"));
pas.sendKeys( "12we4");
//email.sendKeys("chandu@gmail.com");
driver.findElement(By.name("login")).click();
//Thread.sleep(2000);
	 //driver.quit();
	}
}
