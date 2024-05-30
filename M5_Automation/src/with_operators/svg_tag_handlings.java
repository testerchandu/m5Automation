package with_operators;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class svg_tag_handlings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/4");
		Thread.sleep(10000);
        driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']"));
     	Thread.sleep(10000);
		String pswd=driver.getWindowHandle();
		System.out.println(pswd);
		Set<String>all=driver.getWindowHandles();
		System.out.println(all);
		driver.quit();
 }
}
