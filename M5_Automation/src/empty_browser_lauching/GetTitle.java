package empty_browser_lauching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {
	//launch browse
	WebDriver driver=new ChromeDriver();
	//navigate to web file
	driver.get("https://www.instagram.com/");
    //fetch nthe title
	String title =driver.getTitle();
	System.out.println(title);

}
}

