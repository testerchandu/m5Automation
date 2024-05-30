package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname_exception 
{
	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/register");
     driver.findElement(By.className("search-box-textui  autocomplete-input")).sendKeys("gg");
	
}
}