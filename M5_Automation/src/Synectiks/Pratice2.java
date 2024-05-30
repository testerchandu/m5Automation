package Synectiks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 class Pratice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appkube.synectiks.net/app/dashboard");
		driver.findElement(By.id( "userName")).sendKeys( "ram12341");
		driver.findElement(By.id( "password")).sendKeys( "Chandu@123");
 		driver.findElement(By.xpath( "//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath( "//button[@type='submit']")).click();
	}
}