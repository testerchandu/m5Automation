package wait_statements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class flueint_wait {
public static void main(String[] args) {
	//cretae obj for fluent wait
	WebDriver driver=new ChromeDriver();
	FluentWait wait=new FluentWait(driver);
	//specify time for wait
	wait.withTimeout( Duration.ofSeconds(10));
	//polling time
	wait.pollingEvery( Duration.ofMillis(100));
	//ignore exception
	wait.ignoring(null, null );
	//provide condition
	wait.until(ExpectedConditions.visibilityOf (null));
}
}
