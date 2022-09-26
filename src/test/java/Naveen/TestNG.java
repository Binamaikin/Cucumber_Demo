package Naveen;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@Test
public class TestNG {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://freecrm.com/");
	}
	
	public void verifyPageTitelTest() {
	String title =	driver.getTitle();
	System.out.println("the page titel is:"+title);
	
	
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	

}
