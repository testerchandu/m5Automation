package testNGG;
 
import org.testng.annotations.Test;

public class demo_on_depends {
@Test(priority=1)
	public void sampleone() {
		System.out.println("sample one got excuted");
	}
@Test(priority=2)
public void sampletwo() { 
	System.out.println("sample two got excuted");
}
@Test(dependsOnMethods = "sampleone")
public void samplethree() {
	System.out.println("sample three got excuted");
}
}

