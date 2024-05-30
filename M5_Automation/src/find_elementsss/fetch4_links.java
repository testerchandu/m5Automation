package find_elementsss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.systeminfo.SystemInfo;

public class fetch4_links {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
 //List<WebElement>alllinks=driver.findElements( By.xpath("//a[starts-with(text(),'4')]"));
 List<WebElement>alllinks1=driver.findElements( By.xpath("//a[starts-with(@class,'card-link')]"));
	Thread.sleep(1000);
List<WebElement>alllinks=driver.findElements( By.xpath(" //p[text()='C#']"));
  for(WebElement links:alllinks)
 { 
	 System.out.println(links.getText());
	 links.click();
	 driver.quit();
 }
 }
 }