package empty_browser_lauching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class use_of_geturl {
public static void main(String[] args) {
	//lauch browser
	WebDriver driver=new ChromeDriver();
//	navigate to fb
	driver.get("https://www.facebook.com/");
	//fetch title
	String cUrl=driver.getTitle();
	//fetch current url
	String ur=driver.getCurrentUrl();
	//validate
	if(cUrl.contains("facebook")&& ur.contains("facebook"))
			{
			System.out.println("test case pass");
	}
	else
	{
		System.out.println("test case fail");
	}
	driver.quit();		
}
}