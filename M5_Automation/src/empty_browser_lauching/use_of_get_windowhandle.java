package empty_browser_lauching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class use_of_get_windowhandle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get( "https://www.hyrtutorials.com/p/window-handles-practice.html");
	//fetch parent
	String pwid= driver.getWindowHandle();
	System.out.println(pwid);
	//click
	driver.findElement(By.id("open new Windowbtn")).click();
	//fetch all
   Set<String>allWinds=driver.getWindowHandles();
	System.out.println(allWinds);
	driver.quit();
}
}
