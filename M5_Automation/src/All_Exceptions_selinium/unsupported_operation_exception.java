package All_Exceptions_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unsupported_operation_exception {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name( "q")).sendKeys("c");
		//driver.findElement(By.xpath( "//tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Delhi')]")).click();		 
}
}