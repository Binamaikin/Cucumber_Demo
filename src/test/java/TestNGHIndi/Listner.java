package TestNGHIndi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(TestNGHIndi.ListnerTwo.class)
public class Listner {

	@Test
	public void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		driver.close();
		driver.quit();
		
	}
	@Test
	public void testfail() {
		System.out.println("Faild Test Case");
		Assert.assertTrue(false);
	}

	@Test
	public void testSkiped() {
		System.out.println("Skiped Test Case");
		throw new SkipException("skip expection thrown...");
	}
}
