 package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//step-->create class same as webpage name
public class menmodule {
		//step2-->create a parametrized constructor
		public menmodule (WebDriver driver) {
			//step4---> initilize the webelement
			PageFactory.initElements( driver, this);
		}
		//step3--> identify webelement
		@FindBy (name="men")
		private WebElement click_Button;
		public WebElement getLogin_Button() {
			return click_Button;
		}
		} 

