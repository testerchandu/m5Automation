package testNGG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class depends_onmethods {
	WebDriver driver =new ChromeDriver();
@Test
 public void register() {
	driver.get("https://workflow.synectiks.net/");
	System.out.println("Register page is completed");
}
@Test()
public void login() throws InterruptedException { 
	Thread.sleep(1000);
	//driver.manage().window().maximize();
	System.out.println("login page is completed");
}
@Test
public void logout() {
	System.out.println("logoutpage is completed");
	
}
}