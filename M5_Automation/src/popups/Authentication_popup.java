package popups;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
		//we have to pass in url username,password in url ITSSELF
		//driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.navigate().to("https://naga:chandu@www.facebook.com/");
		//driver.navigate().to("https:www.facebook.com/");
}
}