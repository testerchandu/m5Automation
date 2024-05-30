package mouse_related;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
        WebElement Washington=driver.findElement(By.id("box3"));
       WebElement Usa=driver.findElement(By.id("box103"));
       WebElement rome=driver.findElement(By.id("box6"));
       WebElement itali=driver.findElement(By.id("box106"));
      WebElement SouthKorea=driver.findElement(By.id("box5"));
       WebElement Seoul=driver.findElement(By.id("box105"));
       WebElement oslo=driver.findElement(By.id("box1"));
       WebElement norway=driver.findElement(By.id("box101"));
       WebElement madrid=driver.findElement(By.id("box7"));
       WebElement spain=driver.findElement(By.id("box107"));
       WebElement cophengan=driver.findElement(By.id("box2"));
       WebElement denmark=driver.findElement(By.id("box102"));
       WebElement swedden=driver.findElement(By.id("box4"));
       WebElement stockhalm=driver.findElement(By.id("box104"));
       
       //STEP--->CREATE OBJ
       Actions act=new Actions(driver);
       act.dragAndDrop(Washington, Usa).perform();
       act.dragAndDrop(rome, itali).perform();
       act.dragAndDrop(SouthKorea, Seoul).perform();
       act.dragAndDrop(oslo, norway).perform();
       act.dragAndDrop(madrid, spain).perform();
       act.dragAndDrop(cophengan, denmark).perform();
       act.dragAndDrop(swedden, stockhalm).perform();
       
}
}