package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class fbscreenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id( "email")).sendKeys("nagachandu0649@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys( "12werfghnm");
		// driver.findElement(By.name( "login")).click();
		//step1-->downcast
		TakesScreenshot ts=((TakesScreenshot)driver);
		//step2
		File temp=ts.getScreenshotAs(OutputType.FILE);
		//step3
		File perm = new File("./s1/ss.png");
		//step4
		FileHandler.copy(temp, perm);
		
		//driver.quit();
		}
}




