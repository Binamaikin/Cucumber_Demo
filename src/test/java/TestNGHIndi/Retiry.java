package TestNGHIndi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retiry {
	
	@Test(retryAnalyzer =RetryAnalyzer.class)
	public void TestCase001() {
		 
		Assert.assertTrue(false);
	}
	
	@Test(retryAnalyzer =RetryAnalyzer.class)
	public void TestCase002() {
		 
		Assert.assertTrue(false);

}
	
	@Test
	public void TestCase003() {
		 
		Assert.assertTrue(true);
		
	}
}

