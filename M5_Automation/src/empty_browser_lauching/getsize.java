package empty_browser_lauching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class getsize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.swiggy.com/");
	Dimension size=driver.manage().window().getSize();
	/*System.out.println(size);
	System.out.println(size.height);
	System.out.println(size.width);*/
	Point position=driver.manage().window().getPosition();
	System.out.println(position.x);
	System.out.println(position.y);
	String pageSource = driver.getPageSource();
	System.out.println("Page Source: " + pageSource);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL: " + currentUrl);
	/*String title = driver.getTitle();
	//System.out.println("Page Title: " + title);
	 //Dimension d=new Dimension(300,20);
	 //driver.manage().window().setSize(d);
	 //driver.get("https://www.facebook.com/");
	driver.findElement(By.id("passContainer"));
	  driver.get("https://www.oracle.com/in/java/technologies/downloads/");
      driver.findElement(By.id("products1")).click();
      Thread.sleep(1000);*/
         driver.quit();
}

 
}
