package All_Exceptions_selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_element_Exception {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(100));
		driver.get( "https://omayo.blogspot.com/");
		 Thread.sleep(3000);
		WebElement textarefild = driver.findElement(By.id( "ta1"));
		textarefild.sendKeys( "nagachandu");
		//Thread.sleep(1000);
		driver.findElement( By.linkText("compendiumdev")).click();
		//Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		textarefild = driver.findElement(By.id( "ta1"));
		textarefild.clear();
	driver.quit();
	}
}
