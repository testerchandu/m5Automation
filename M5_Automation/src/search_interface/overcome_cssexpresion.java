package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class overcome_cssexpresion {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to( "https://demowebshop.tricentis.com/");
          driver.findElement(By.cssSelector( "input[class='search-box-text ui-autocomplete-input'] "));
}
}