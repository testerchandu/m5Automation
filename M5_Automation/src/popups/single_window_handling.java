package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class single_window_handling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
	Robot robot =new Robot();
	robot.keyPress( KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	Thread.sleep(2000);
	String pwid = driver.getWindowHandle();
	Set<String> allwind = driver.getWindowHandles();
	System.out.println(pwid);
	System.out.println(allwind);
	for(String wid:allwind)
	{
		if(wid.equals(pwid))
		{	
			System.out.println("passed");
		}else
		{
			driver.switchTo().window(wid).close();
			driver.quit();
		} 
	}
	}
}

