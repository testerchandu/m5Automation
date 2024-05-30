package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//step-->create class same as webpage name
public class Welcome_page {
	//step2-->create a parametrized constructor
	public Welcome_page(WebDriver driver) {
		//step4---> initilize the webelement
		PageFactory.initElements( driver, this);
	}
	//step3--> identify webelement
	@FindBy(id="loginBtn")
	private WebElement login_Button;
	public WebElement getLogin_Button() {
		return login_Button;
	}
	} 