package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//click on js alert button
		 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("CAPATAIN AMERICA");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.quit();
}}
//DONE IN BACKEND ITSSELF WE CANT SEE IN UI
