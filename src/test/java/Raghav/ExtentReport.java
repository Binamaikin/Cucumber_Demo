//package Raghav;
//
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestResult;
//import org.testng.SkipException;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.Markup;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.model.Report;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ExtentReport {
//
//	ExtentSparkReporter htmlreporter;
//	ExtentReports reports;
//	ExtentTest test;
//	// Selenium Webdriver With Java in Hindi #49 -Extent Report In TestNG (Version 5) | With Practical
//	
//	@BeforeTest
//	public void StartReport() {
//		
//		htmlreporter = new ExtentSparkReporter("ExtentReportDemo.html");
//		reports = new ExtentReports();
//		reports.attachReporter(htmlreporter);
//		
//		reports.setSystemInfo("Machin", "testpc1");
//		reports.setSystemInfo("OS", "Windos10");
//		reports.setSystemInfo("user", "Maikin");
//		reports.setSystemInfo("Browser", "Chrome");
//		
//		htmlreporter.config().setDocumentTitle("ExtentReportDemo");
//		htmlreporter.config().setReportName("Test Report");
//		htmlreporter.config().setTheme(Theme.STANDARD);
//		htmlreporter.config().setTimeStampFormat("EEEE,MMMM, DD, yyyy, hh:mm, a ");
//
//}
//	@Test
//	public void LaunchBrowser() {
//		
//	test=	reports.createTest("Browser Launch and open URL");
//		Assert.assertTrue(true);
//	}
//	
//	@Test
//	public void VarifyTitel() {
//		
//	test=	reports.createTest("VarifyTitel");
//		Assert.assertTrue(false);
//	}
//
//	@Test
//	public void VarifyLogo() {
//		
//	test=	reports.createTest("VarifyLogo");
//		Assert.assertTrue(true);
//
//}
//	
//	@Test
//	public void VarifyEmail() {
//		
//	test=	reports.createTest("VarifyEmail");
//		throw new SkipException("Skiping this test case");
//		
//		
//	}
//@AfterMethod
//public void getTestResult(ITestResult Result) {
//	
//		if(Result.getStatus()==ITestResult.FAILURE)
//		{
//			test.log(Status.FAIL, MarkupHelper.createLabel(Result.getName()+"FAIL" , ExtentColor.RED));
//		}
//		else if (Result.getStatus()== ITestResult.SUCCESS) {
//			test.log(Status.PASS, MarkupHelper.createLabel(Result.getName()+"pass" , ExtentColor.GREEN));
//			
//		}
//		else if (Result.getStatus()== ITestResult.SKIP) {
//			test.log(Status.SKIP, MarkupHelper.createLabel(Result.getName()+"SKIP" , ExtentColor.BLACK));
//		
//}
//}
//		@AfterTest
//		public void tearDown(){
//		{
//			
//			reports.flush();
//	}
//}
//
//}
