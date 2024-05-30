package mouse_related;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mouse_over {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//IDENTIFY COMPUTERS
		WebElement computers = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])"));
		//step1;-->CREATE AN OBJ FOR ACTIONS AND PASS DRIVER REFERENCE
		Actions act =new Actions(driver);
		//STEP-->2PERFORM USE ACTIONS CLASS METHOD
		act.moveToElement(computers).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath( "(//a[contains(text(),'Desktops')])[1]")).click();
		WebElement desktops = driver.findElement(By.xpath("//a[contains(text(),'Desktops')])[1]"));
		act.click(desktops).perform();
//		driver.quit();
}
}