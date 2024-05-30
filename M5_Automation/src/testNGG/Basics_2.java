package testNGG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basics_2 {
@Test()
public void register() {
	//System.out.println("Register completed");
	Reporter.log("register completed", true);
}
@Test(dependsOnMethods="register")
public void login() {
	//System.out.println("login completed");
	Reporter.log("login completd", true);
}
@Test(priority=2)
public void logout() {
	//System.out.println("logout completed");
	Reporter.log("logout completd", true);
}
}
