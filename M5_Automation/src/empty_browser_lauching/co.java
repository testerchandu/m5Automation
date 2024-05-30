package empty_browser_lauching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class co {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://edu.gcfglobal.org/en/topics/computers//");
		Thread.sleep(2000);
		driver.findElement(By.id("NewWindowBtn")).click();
		//close
		Thread.sleep(2000);
		driver.quit();
	}

}



