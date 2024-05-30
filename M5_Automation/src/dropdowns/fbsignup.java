package dropdowns;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class fbsignup {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        WebElement all = driver.findElement( By.name( "birthday_day"));
       all.click();
       Select sel=new Select(all);
       sel.selectByValue( "1");
      sel.selectByVisibleText( "2");
      sel.selectByVisibleText( "3");
      sel.selectByVisibleText( "4");
      sel.selectByVisibleText( "5");
      sel.selectByVisibleText( "6");
      sel.selectByVisibleText( "7");
      sel.selectByVisibleText( "8");
      sel.selectByVisibleText( "9");
      sel.selectByVisibleText( "10");
      sel.selectByVisibleText( "11");
      sel.selectByVisibleText( "12");
      sel.selectByVisibleText( "13");
      sel.selectByVisibleText( "14");
       //driver.quit();
	}
}