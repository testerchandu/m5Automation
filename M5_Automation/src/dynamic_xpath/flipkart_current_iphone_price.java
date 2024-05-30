package dynamic_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_current_iphone_price {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/apple-iphone-15-black-128-gb/p/itm6ac6485515ae4?pid=MOBGTAGPTB3VS24W&lid=LSTMOBGTAGPTB3VS24WYZPL8F&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_OrganicAutoSuggest_7_3_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_7_3_na_na_na&fm=organic&iid=77bc549d-2216-40ee-8068-bb51835d637b.MOBGTAGPTB3VS24W.SEARCH&ppt=None&ppn=None&ssid=q9norjfq0g0000001704780675630&qH=0b3f45b266a97d70");
		Thread.sleep(1000);
     WebElement currentprice= driver.findElement( By.xpath("//span[text()='APPLE iPhone 15 (Black, 128 GB)']/../../../div[4]/div[1]/div/div[1]"));
	 System.out.println(currentprice.getText());
		 WebElement currentprice1= driver.findElement( By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]"));
		 System.out.println(currentprice1.getText());
		 driver.quit();
	}
}