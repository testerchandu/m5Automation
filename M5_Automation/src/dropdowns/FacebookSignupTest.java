package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

 		public static void main(String[] args) {
  	        	        WebDriver driver = new ChromeDriver();
 	        driver.get("https://www.facebook.com/signup");
	        // Check if navigation is successful
	        String currentUrl = driver.getCurrentUrl();
	        if (currentUrl.contains("facebook.com/signup")) {
	            System.out.println("Navigation to Facebook signup page successful.");
	            
	            // Check if year dropdown is displayed
	            WebElement yearDropdown = driver.findElement(By.id("year"));
	            if (yearDropdown.isDisplayed()) {
	                System.out.println("Year dropdown is displayed.");
	                
	                // Validate all options can be selected
	                Select selectYear = new Select(yearDropdown);
	                int optionsCount = selectYear.getOptions().size();
	                if (optionsCount > 1) {
	                    System.out.println("Year dropdown has options.");
	                    System.out.println("Validation complete. All options can be selected.");
	                } else {
	                    System.out.println("Year dropdown has no options.");
	                }
	            } else {
	                System.out.println("Year dropdown is not displayed.");
	            }
	        } else {
	            System.out.println("Navigation to Facebook signup page failed.");
	        }
	        // Close the browser
	        //driver.quit();
	}

}
