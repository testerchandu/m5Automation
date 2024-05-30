package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelements {
	public static void main(String[] args) throws IOException {
		Date date=new Date();
		System.out.println(date);
				String cdate = date.toString().replace(" ","-").replace(":", ":");
				System.out.println(cdate);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	 
		//email
		WebElement email = driver.findElement(By.id( "email"));
		email.sendKeys( "utgk");
		//STORE TEMP
		File temp=email.getScreenshotAs(OutputType.FILE);
		//STORE PERMANNTLY
		File perm = new File("./s2/ss"+cdate+".png");
		//CALL BOTH PERM,TEMP
		 FileHandler.copy(temp, perm);
	}
}