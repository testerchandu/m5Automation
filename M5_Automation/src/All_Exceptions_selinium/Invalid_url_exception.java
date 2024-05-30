package All_Exceptions_selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_url_exception {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get( "https://omayo.blogspot.com/");
		driver.quit();
	}
}
