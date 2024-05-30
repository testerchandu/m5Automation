package find_elementsss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_iphones {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement( By.name("q")).sendKeys( "iphones");
	driver.findElement(By.xpath( "//button[@type='submit']")).click();
	//featch al iphones
    List<WebElement> allnames=driver.findElements(By.xpath("//div[contains(text(),'apple')]"));
	
	for(WebElement ss:allnames)
	{	
	  System.out.println(ss.getText());
	}
	driver.quit();
	Thread.sleep(1000);
}
}