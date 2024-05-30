package mouse_related;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class FlipkartAutomation {

	    public static void main(String[] args) throws InterruptedException {
	        // Set the path to your ChromeDriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to Flipkart
	            driver.get("https://www.flipkart.com/");

	            // Hover over "Electronics" menu
	            WebElement electronicsMenu = driver.findElement(By.xpath("//span[text()='Electronics']"));
	            Actions actions = new Actions(driver);
	            actions.moveToElement(electronicsMenu).build().perform();

	            // Click on "Wired Earphones"
	            WebElement wiredEarphonesOption = driver.findElement(By.xpath("//a[text()='Wired Earphones']"));
	            wiredEarphonesOption.click();

	            // Fetch and print the current price
	            WebElement currentPriceElement = driver.findElement(By.xpath("//div[@class='_30jeq3']"));
	            String currentPrice = currentPriceElement.getText();
	            System.out.println("Current Price of Wired Earphones: " + currentPrice);
	        } finally {
	        	Thread.sleep(1000);
	        	
	            // Close the browser
	            driver.quit();
	        }
	    }
	
}
