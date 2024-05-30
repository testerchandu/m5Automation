package dynamic_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchelementsall {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/");
		 Thread.sleep(1000);
		//identify the price
	List<WebElement>allmrp1 =driver.findElements(By.xpath("//a[@class='hrefch']/../../h5"));
		// List<WebElement>allmrp1 =driver.findElements(By.xpath("//h5[contains(text(),'$360')]"));
		 List<WebElement>allmrp2 =driver.findElements(By.xpath("//a[contains(@class,'hrefch')]"));;
	 for(WebElement allprice:allmrp1)
	 {
		System.out.println(allprice.getText());
	 }
	 for(WebElement allprice:allmrp2)
	 {
		 System.out.println(allprice.getText());
	 }
	 driver.quit();
	}
}
//a[text()='Samsung galaxy s6']/../../h5 