package find_elementsss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fatch_all_links {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get( "https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	   List<WebElement>alllinks = driver.findElements( By.xpath( "//a"));
	   System.out.println(alllinks.size());
	   System.out.println(alllinks);
	   for(WebElement link:alllinks)
	   {
	   System.out.println(link.getText());		   
	   } 
	   driver.quit();
}
}