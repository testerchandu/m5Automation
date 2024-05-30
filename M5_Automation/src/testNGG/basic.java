package testNGG;

import org.testng.annotations.Test;

public class basic {
	@Test(priority=1) 
	public void register() {
		System.out.println("Register completed");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("login completed");
	}
	@Test(priority=2)
	public void logout() {
		System.out.println("logout completed");
	}
}
