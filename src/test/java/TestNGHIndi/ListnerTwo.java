package TestNGHIndi;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListnerTwo implements ITestListener {
	
	public void onStart(ITestContext Result) {
		System.out.println("On start metho invoke");
	
	}
	
	public void onFinish(ITestContext Result) {
		System.out.println("On finish metho invoke");

}
	
	public void onTestFailure(ITestContext Result) {
		System.out.println("Name of test method faild:"+ Result.getName());
}
	public void onTestSkiped(ITestContext Result) {
		System.out.println("Name of the test method skiped" + Result.getName());
		
	}
	public void onTestStart(ITestContext Result) {
		System.out.println("Name of the test method started:"+ Result.getName());
	}
	public void onTestSucess(ITestContext Result) {
		System.out.println("Name of the method sucessfully excuceted"+ Result.getName());
	}
}