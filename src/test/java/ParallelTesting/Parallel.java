package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Parallel {
WebDriver driver=null;
	@Test
	public void Test1() throws InterruptedException {
		System.out.println("i am in Test1 |"+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=hybrid+framework+in+selenium+webdriver");
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	}
	
	@Test
	public void Test2() throws InterruptedException {
		System.out.println("i am in Test1|"+Thread.currentThread().getId());
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TDaMT7dIMixQYDRgdGDw4kxPLFYozi8tyQAAd94IRw&q=gas+south&oq=ga&aqs=chrome.3.69i57j35i39j46i199i465i512l2j0i512j0i131i433i512j46i131i199i433i465i512j69i61.2764j0j7&sourceid=chrome&ie=UTF-8");
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	}
}
