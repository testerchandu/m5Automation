package popups;
import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class chrome_options {
	public static void main(String[] args){
		//step:-1
		ChromeOptions options=new ChromeOptions();
		//step:-2
		options.addArguments("--disable-notifications");
		//step:-3
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");	
		driver.quit();
}
}