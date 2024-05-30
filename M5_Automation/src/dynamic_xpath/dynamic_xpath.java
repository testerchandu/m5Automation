 package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to( " https://www.demoblaze.com/");
	//identify the price
	Thread.sleep(5000);
	WebElement price=driver.findElement( By.xpath("//a[text()='Samsung galaxy s6']/../../h5"));
	System.out.println(price.getText());
	driver.quit();
}
}
