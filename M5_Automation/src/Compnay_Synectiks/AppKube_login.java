package Compnay_Synectiks;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AppKube_login {
	      public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriver driver =new ChromeDriver();
		  driver.get( "https://appkube.synectiks.net/auth/signin");
		  driver.manage().window().maximize();
		  driver.findElement( By.id("userName")).sendKeys( "Demos1234");
		  driver.findElement( By.id("password")).sendKeys( "Chandu@123");
	      driver.findElement(By.xpath( "//button[@type='submit']")).click();
	      Thread.sleep(5000);
	     //driver.findElement(By.xpath( "//div[@role='button']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath( "//div[contains(text(),'Super Admins')]")).click();
	      Robot r=new Robot();
 	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_ENTER);
	      r.keyRelease( KeyEvent.VK_ENTER);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_ENTER);
	      r.keyRelease( KeyEvent.VK_ENTER);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_ENTER);
	      r.keyRelease( KeyEvent.VK_ENTER);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_TAB);
	      r.keyRelease( KeyEvent.VK_TAB);
	      Thread.sleep(1000);
	      r.keyPress( KeyEvent.VK_ENTER);
	      r.keyRelease( KeyEvent.VK_ENTER);
	      Thread.sleep(1000);
	      driver.findElement(By.cssSelector("div.standalone-container div.environment-container div.add-new-environment.MuiBox-root.css-0 div.MuiBox-root.css-8atqhb div.MuiGrid-root.MuiGrid-container.css-1a9ep1y div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-9.MuiGrid-grid-lg-9.css-1xd5sck:nth-child(2) div.MuiBox-root.css-8atqhb div.MuiGrid-root.MuiGrid-container.css-myh4i0 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-8.css-kw2xn2:nth-child(1) div.export-sction.MuiBox-root.css-0 div.environment-fliter.MuiBox-root.css-0 > div.fliter-toggel.new-environment.MuiBox-root.css-0")).click();
          driver.findElement(By.linkText( "Amazon Web Services")).click();
          driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/div[3]/button[1]")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath( "//body/div[@id='root']/div[1]/div[3]/div[1]/div[2]/button[2]")).click();
          Thread.sleep(1000);
          driver.findElement(By.name( "displayName")).sendKeys("aszxdcfvgbhn");
          driver.findElement(By.name("roleArn")).sendKeys( "arn:aws:iam::893233071719:user/user");
          driver.findElement(By.name( "externalId")).sendKeys("ME4@s7fv@sQsghDvsea4R");
          driver.findElement(By.cssSelector("div.standalone-container div.new-account-container.MuiBox-root.css-0 div.new-account-page-container.MuiBox-root.css-0 div.d-flex.justify-content-end.align-items-center.wizard-step-button.MuiBox-root.css-0 > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.primary-btn.m-r-2.css-1hw9j7s:nth-child(2)")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
          Thread.sleep(1000);
          driver.findElement(By.cssSelector( "body.modal-open:nth-child(2) div.modal.fade.show div.modal-dialog.select-account-modal-container div.modal-content div.modal-body div.MuiBox-root.css-8atqhb div.MuiGrid-root.MuiGrid-container.css-myh4i0 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-4.css-1udb513:nth-child(3) div.d-flex.align-items-center > label:nth-child(2)")).click();
//        driver.findElement(By.xpath("//label[contains(text(),'HR')]")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[2]")).click();
          Thread.sleep(1000);
          driver.findElement(By.cssSelector( "div.standalone-container div.new-account-container.MuiBox-root.css-0 div.new-account-page-container.MuiBox-root.css-0 div.d-flex.justify-content-end.align-items-center.wizard-step-button.MuiBox-root.css-0 > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.primary-btn.m-r-2.css-1hw9j7s:nth-child(2)")).click();          
          driver.findElement(By.xpath( "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[2]")).click();
          driver.quit();
	}
}