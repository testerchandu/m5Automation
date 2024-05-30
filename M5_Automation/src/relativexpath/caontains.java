package relativexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caontains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.navigate().to( "https://login.salesforce.com/?locale=in");
		driver.findElement( By.xpath( "//a[contains(@id,'forg')]")).click();
		driver.findElement( By.xpath("//a[contains(@id,'mydomain')]")).click();
		driver.findElement( By.xpath("//input[contains(@id,'u_0_b_TD')]"));
		driver.findElement( By.xpath("//input[contains(@id,'u_0_g')]")).sendKeys( "12345");
		driver.findElement(By.xpath( "//input[id,'username']"));
		/*driver.findElement( By.id( "username")).sendKeys( "chandu");
		driver.findElement( By.className( "username")).sendKeys( "naga");*/
		Thread.sleep( 1333);
}
}