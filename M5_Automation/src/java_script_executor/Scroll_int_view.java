package java_script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_int_view {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		WebElement sub = driver.findElement(By.xpath("//a[text()='JMeter']"));
		//step1
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//step2
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(false)",sub);
	// driver.quit(); 
	}
}
       