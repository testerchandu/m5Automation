package mouse_related;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapp.skillrary.com/");
		WebElement JMeter = driver.findElement(By.xpath("//a[text()='JMeter']"));
		Actions act=new Actions(driver);
		act.scrollToElement(JMeter).perform();
	}
}
//button[text()='Subscribe']
