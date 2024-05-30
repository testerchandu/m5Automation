package dynamic_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alliphoneratings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to( "https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone&requestId=019f819d-0bf0-4854-9996-53a921c07b13");
		//identify the price
		Thread.sleep(5000);
		List<WebElement> rating=driver.findElements( By.xpath("//div[@class='_4rR01T']/../../div[1]/div[2]/span[1]"));
		for(WebElement alliphone:rating )
		{
			System.out.println(alliphone.getText());
		}
		driver.quit();
	}
}
	
