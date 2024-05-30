package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	//step1-->downcast
	TakesScreenshot ts =(TakesScreenshot)driver;
	//step2
	File temp=ts.getScreenshotAs(OutputType.FILE);
	//step3
	File perm=new File ("./s2/ss.png");
	 //step4
	 FileHandler.copy(temp, perm);
}
}