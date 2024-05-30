package Frames;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex1_one {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		   List<WebElement>frame = driver.findElements(By.xpath( "//iframe | //frame"));
		   System.out.println(frame.size());
//		   driver.quit(); 
}
}