package date;

import java.util.HashMap;

public class  juice_shop {
	 public static void main(String[] args) throws AWTException, InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get( "https://juice-shop.herokuapp.com/#/login");
    driver.manage().window().maximize();
    Robot r=new Robot();
    r.keyPress( KeyEvent.VK_TAB);
    r.keyRelease( KeyEvent.VK_TAB);
    Thread.sleep(1000);
    r.keyPress( KeyEvent.VK_TAB);
    r.keyRelease( KeyEvent.VK_TAB);
    Thread.sleep(1000);
    r.keyPress( KeyEvent.VK_TAB);
    r.keyRelease( KeyEvent.VK_TAB);
    Thread.sleep(1000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    driver.findElement(By.id( "email")).sendKeys( "nagachandu0649@gmail.com");
    driver.findElement(By.id( "password")).sendKeys( "Chandu@123");
    driver.findElement(By.xpath( "//button[@id='loginButton']")).click();
	}
}
