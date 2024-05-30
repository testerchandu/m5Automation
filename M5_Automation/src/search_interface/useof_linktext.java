package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useof_linktext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://demowebshop.tricentis.com/register");
		 //identify register and click
		driver.findElement(By.linkText("Register")).click();
		//identify register amd click by using 1sthalf words and last words and middle of them also
		driver.findElement(By.partialLinkText("regi")).click();
		
	
}
}