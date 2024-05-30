package pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import screenshot.webelements;
public class googlesearchengine {
	private static WebElement element=null;
public static WebElement text_search(WebDriver driver) {	 
     element =driver.findElement(By.id("input"));
	return element;
}
public static WebElement button_search(WebDriver driver) {
	element =driver.findElement(By.id("icon"));
	return element;
}
}