package TestNGHIndi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	@org.testng.annotations.BeforeTest
	public void BeofreTest() {
		System.out.println("Beofoe Test");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
		
	}
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("Beofore Method");
	}


	@Test
	public void Test1() {
		System.out.println("This is Test1");

	}

	@Test
	public void Test2() {
		System.out.println("This is Test2");

	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
		
	}
	
}
