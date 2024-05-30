package Compnay_Synectiks;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
 public class Appkube {
 public static void main(String[] args) throws InterruptedException, IOException {
 WebDriver driver =new ChromeDriver();
 driver.get( "https://appkube.synectiks.net/auth/signup");
 driver.manage().window().maximize();
 WebElement firstname = driver.findElement( By.id("firstName"));
 firstname.sendKeys( "naga ");
 Thread.sleep(1000);
 driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]")).click();
 Thread.sleep(1000);
 TakesScreenshot ts =(TakesScreenshot)driver;	 
 File temp=ts.getScreenshotAs(OutputType.FILE);
 File perm=new File ("./s4/ss.png");	  
 FileHandler.copy(temp, perm);
 driver.quit();
}
}
