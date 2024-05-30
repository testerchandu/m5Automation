package flip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {
	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
  driver.navigate().to( "https://www.flipkart.com/"); 
  driver.manage().window().maximize();
  driver.findElement(By.linkText( "₹16,150")).click();
  driver.quit();   
  	}
}