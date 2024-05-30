package shoppers_stack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_03_Men {
	@Test(groups="smoke")
	public void login() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./commondata/chiyan.properties");
		//step2-->create obj for properties
		Properties prop=new Properties();
		//step3-->load the file
		prop.load(fis);
		//step4--->read the data
		String data = prop.getProperty("url");
		driver.get(data);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	   driver.findElement(By.id("Email")).click();
	   driver.findElement(By.id("Email")).sendKeys( "nagachandu0649@gmail.com");
	   driver.findElement(By.id("Password")).click();
	   driver.findElement(By.id("Password")).sendKeys( "Chandu@123");
	   driver.findElement(By.xpath("//button[@id='Login']")).click();
	   Thread.sleep(5000); 
	   driver.findElement(By.xpath("//a[@id='men']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath( "//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]")).click();
	driver.quit();
	}
}