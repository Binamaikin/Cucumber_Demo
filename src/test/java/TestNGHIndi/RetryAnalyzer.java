package TestNGHIndi;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	
	int counterForRetryAttempts =0;
	
	int setmaxLimitForRetry = 3;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
