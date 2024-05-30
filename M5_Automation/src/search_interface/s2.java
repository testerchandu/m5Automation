package search_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/register");
		//identify radio button click
		    driver.findElement(By.name("Gender")).click();
		 //identify first name
     	driver.findElement(By.id("FirstName")).sendKeys( "chandu");
	//identify lastname
	    driver.findElement(By.id("LastName")).sendKeys("borra");
	//identify email
        driver.findElement(By.id("Email")).sendKeys("nagachandu@123");
    //identify password id
     	driver.findElement(By.name( "Password") ).sendKeys("chandu");
	//identify conform pass
	    driver.findElement(By.name( "ConfirmPassword")).sendKeys("chandu");
	    //identify login btn
	    driver.findElement(By.name("login")).click();
	//identify register id clicked
	    driver.findElement(By.id("register-button")).click();
		 //identify register and click
	    driver.findElement(By.linkText("Register")).click();
	  //identify register amd click by using 1sthalf words and last words and middle of them also
	  		//driver.findElement(By.partialLinkText("regi")).click();
	  		
}
}