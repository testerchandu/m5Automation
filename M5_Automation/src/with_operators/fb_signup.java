package with_operators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_signup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//driver.findElement(By.xpath("//input[@type='radio' and @value='-1']")).click();
		//driver.findElement(By.xpath("//input[@type='radio' or @value='2']")).click();
		driver.findElement(By.xpath("// type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();}
}
