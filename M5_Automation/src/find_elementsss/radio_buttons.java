package find_elementsss;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class radio_buttons {
	public static void main(String[] args) throws InterruptedException {		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://demowebshop.tricentis.com/");
List<WebElement>allradiobutton = driver.findElements( By.xpath("//input[@type='radio']"));
	    //List<WebElement>allradiobutton = driver.findElements( By.xpath("//input[@id='pollanswers-4']"));
for(WebElement radiobutton:allradiobutton)
{
	 radiobutton.click();   
	//Thread.sleep(1000);
}
	} 
}