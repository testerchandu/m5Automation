package dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class p1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/signup");
		WebElement daydd = driver.findElement(By.id( "day")); 
		Select sel=new Select(daydd);
 		sel.selectByIndex( 5);
//		sel.selectByValue( "6");
		sel.selectByVisibleText( "1");	
//		sel.deselectByIndex(1);
	}
}