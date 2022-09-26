package Raghav;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HExtentReporrtTwo {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeSuite
	public void Setup() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter();


	}
	@Test
	public void Test1() {


	}

	@AfterSuite
	public void Teardown() {



	}

}


