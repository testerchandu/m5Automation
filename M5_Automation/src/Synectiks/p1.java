package Synectiks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class p1 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://workflow.synectiks.net/");
		driver.findElement(By.name("username")).sendKeys( "naga");
		driver.findElement(By.name("password")).sendKeys("n");
		driver.findElement( By.linkText( "submit")).click();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.click().perform();	
  		driver.quit();
	}
}