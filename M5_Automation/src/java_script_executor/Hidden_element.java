package java_script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		//IDENTIFY WEBELEMENT
		WebElement hidden = driver.findElement(By.name("custom_gender"));
		 //NOT ENABLE BY NORMAL APPORAOCH hidden.sendKeys( "others");
		//WE HAVE TO USE JSE arguments[0].value='others'",diasabled
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='others'",hidden);	
}
}