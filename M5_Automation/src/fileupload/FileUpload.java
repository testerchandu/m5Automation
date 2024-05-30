package fileupload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/upload");
	//file upload
	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\nagac\\OneDrive\\Pictures\\Screenshots");
}
}