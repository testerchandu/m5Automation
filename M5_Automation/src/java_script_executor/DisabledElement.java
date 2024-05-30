package java_script_executor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DisabledElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demoapp.skillrary.com/");
	   	 driver.manage().window().maximize();
	   	// WebElement dis = driver.findElement(By.tagName("input")); 
	  //WebElement dis = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]"));
	   	 WebElement dis = driver.findElement(By.xpath( "//input[@class='form-control']"));
		 //NOT ENABLE BY NORMAL APPORAOCH diasabled.sendKeys( "hfuug");
		 //WE HAVE TO USE JSE arguments[0].value='computers'",diasabled
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='computers'",dis);
}
}
   //js.executeScript("arguments[0].scrollIntoView(true)",sub);
    
