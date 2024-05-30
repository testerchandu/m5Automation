package empty_browser_lauching;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.edge.EdgeDriverInfo;
 public class use_of_get {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	 //Thread.sleep(2000);
	 driver.get( "https://www.zeptonow.com/");
	 Thread.sleep(1000);
	 driver.quit();
}
}