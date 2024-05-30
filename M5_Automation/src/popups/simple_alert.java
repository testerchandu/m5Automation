package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple_alert {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//click on js alert button
	 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Thread.sleep(1000);
	//driver.switchTo().alert().dismiss(); 
	driver.switchTo().alert().sendKeys("nagachandu");
	driver.switchTo().alert().accept();
    //driver.switchTo().alert().getText();
	driver.quit();
}}