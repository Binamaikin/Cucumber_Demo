package Raghav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg {
	WebDriver driver=null;
	
	@Test
	public void test1 () throws InterruptedException {
		System.out.println("I am inside test1 |"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.thesaurus.com/e/grammar/pipe-symbol/");
		
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void test2 () throws InterruptedException {
		System.out.println("I am inside test2 |"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		
		Thread.sleep(3000);
		driver.close();
	}
}