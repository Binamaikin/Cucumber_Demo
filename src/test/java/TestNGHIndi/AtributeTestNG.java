package TestNGHIndi;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AtributeTestNG {

	@Test
	public void Test1() {
		System.out.println("Mobile Login Test Case");
	}

	@Test(timeOut=200)
	public void Test2() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Web Login Test Case");
	}
	@Test(priority=1)
	public void Test3() {
		System.out.println("API Login Test Case");
	}
}
