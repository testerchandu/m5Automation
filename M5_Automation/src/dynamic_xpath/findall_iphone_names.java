package dynamic_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findall_iphone_names {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get( "https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone&requestId=019f819d-0bf0-4854-9996-53a921c07b13");
		Thread.sleep(1000);
		List<WebElement> currentnames= driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div[1]/div/div[1]"));
		//List<WebElement> currentnames= driver.findElements(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
         for(WebElement names:currentnames)
         {
        	 System.out.println(names.getText());
         }
         driver.quit();
	}
}
