package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class completelink_text {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement( By.xpath( "//label[text()='Excellent'] ")).click();
	driver.findElement( By.xpath("//label[text()='Good']")).click();
	driver.findElement( By.xpath("//label[text()='Poor']")).click();
	driver.findElement( By.xpath("//label[text()='Very bad']")).click();
	//driver.findElement( By.xpath("(//a[contains(text(),'Book')])[3]")).click();
	//driver.findElement( By.xpath("//a[contains(text(),'Books')]")).click();
	Thread.sleep( 1000);
}
}
