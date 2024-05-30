package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to( "https://www.facebook.com/login/");
	driver.findElement(By.xpath( " //button[contains(@id,loginbu']"));
driver.quit();
}
}
