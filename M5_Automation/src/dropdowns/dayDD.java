package dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dayDD {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/signup");
	//step--->identify DROPDOWN
	WebElement dayDD=driver.findElement( By.id("day"));
	//step2-->create an object for select and pass DD reference
	Select sel=new Select(dayDD);
	//step3-->use select class methods
	sel.selectByIndex( 19);
	Thread.sleep(1000);
	sel.selectByValue( "7");
	Thread.sleep(1000);
	sel.selectByVisibleText( "9");
	Thread.sleep( 1000);
 	driver.quit();
}
}	
