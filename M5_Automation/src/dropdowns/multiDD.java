package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiDD {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapp.skillrary.com/");
		//step--->identify DD
		WebElement multiDD=driver.findElement( By.id("cars"));
		//step2-->create an object for select and pass DD reference
		Select sel=new Select(multiDD);
		//step-->3
		System.out.println(sel.isMultiple());
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByIndex(4);
		Thread.sleep(1000);
		sel.selectByIndex(5);
		//deselcetion
		 sel.deselectByIndex(0);
		 Thread.sleep(1000);
		 sel.deselectAll();
		 driver.quit();
}
}
             