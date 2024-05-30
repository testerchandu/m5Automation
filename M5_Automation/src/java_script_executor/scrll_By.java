package java_script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrll_By {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		 //scrolling wr to jse
		 //step1
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//step2
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		//driver.quit();
}
}