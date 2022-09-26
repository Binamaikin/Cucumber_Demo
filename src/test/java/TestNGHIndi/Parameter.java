package TestNGHIndi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	
	@Test
	@Parameters({"i","j"})
	public void Add(int a, int b) {
		System.out.println(a+b);
	}
	
	
	@Test
	@Parameters({"i","j"})
	public void Substraction(int a, int b) {
		System.out.println(a-b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void Multiply(int a, int b) {
		System.out.println(a*b);
	}

}
