package mouse_related;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to( "https://www.flipkart.com/");
		Thread.sleep(1000);
		//IDENTIFY ELECTRONICS
    WebElement electronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
	Actions act =new Actions(driver);
		//STEP-->2PERFORM USE ACTIONS CLASS METHOD
		act.moveToElement(electronics).perform();
	 
}
}
