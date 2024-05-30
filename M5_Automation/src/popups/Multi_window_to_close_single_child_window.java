package popups;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_window_to_close_single_child_window {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get( "https://www.shoppersstack.com/products_page/5");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[@id='root']/section[2]/article[1]/div[1]/div[2]/div[4]/h6[1]/button[1]/*[1]")).click();
       String pwid = driver.getWindowHandle();
        Set<String> childwind = driver.getWindowHandles();
        for(String wid:childwind) {
        	String alltitles = driver.switchTo().window(wid).getTitle();
        	if(alltitles.equals(childwind))
        	{
        	}
        	else if(alltitles.equals(pwid))
        	{
        		driver.quit();
        	}
}
}
}