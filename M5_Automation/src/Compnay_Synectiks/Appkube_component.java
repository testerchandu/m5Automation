package Compnay_Synectiks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

           public class Appkube_component {
	      public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriver driver =new ChromeDriver();
		  driver.get( "https://appkube.synectiks.net/auth/signin");
		  driver.manage().window().maximize();
		  driver.findElement( By.id( "userName")).sendKeys("steve123");
		  driver.findElement(By.id( "password")).sendKeys( "Chandu@123");
	      driver.findElement(By.xpath( "//button[@type='submit']")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.linkText("BIMapping")).click();
	    // Actions act=new Actions(driver);
	    //act.click();
	     //driver.findElement(By.xpath( "//li[contains(text(),'Cost Analysis')]")).click();        
	} 
}