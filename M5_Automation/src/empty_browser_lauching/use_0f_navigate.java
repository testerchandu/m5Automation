package empty_browser_lauching;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class use_0f_navigate {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver=new ChromeDriver();
/*	driver.navigate().to("https://www.zeptonow.com/" );
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().forward();
	System.out.println();*/
	//we have to create object on URL...
	URL url=new URL ("https://www.facebook.com");
	driver.navigate().to(url);
	//driver.quit();
}
}
