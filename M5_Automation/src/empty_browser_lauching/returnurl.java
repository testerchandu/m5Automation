package empty_browser_lauching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class returnurl {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver()	;

	System.out.println(driver.findElement(By.id("elementId")));
	 driver.quit();
}
}