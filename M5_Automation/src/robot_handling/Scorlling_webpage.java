package robot_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scorlling_webpage {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapp.skillrary.com/");
		//step--->
		Robot robot =new Robot();
		//step-->
		Thread.sleep(1000);
		//robot.keyPress( KeyEvent.VK_PAGE_DOWN);
		//robot.keyPress( KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress( KeyEvent.VK_PAGE_DOWN);
		//robot.keyPress( KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress( KeyEvent.VK_PAGE_DOWN);
		//robot.keyPress( KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		//robot.keyPress( KeyEvent.VK_PAGE_UP);
		//robot.keyPress( KeyEvent.VK_PAGE_UP);
		//2nd time
		Thread.sleep(1000);
		//robot.keyPress( KeyEvent.VK_PAGE_UP);
		//robot.keyPress( KeyEvent.VK_PAGE_UP);
		//driver.quit();
		System.out.println(robot);
}
}

