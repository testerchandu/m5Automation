package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to( "https://www.123formbuilder.com/free-form-templates/marathon-fundraising-application-form");
	 driver.findElement(By.name( "i123-input")).click();
	 Thread.sleep(1223);
	 driver.quit();
}

 
	// TODO Auto-generated method stub
	
}

