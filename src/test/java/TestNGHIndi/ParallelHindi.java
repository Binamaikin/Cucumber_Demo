package TestNGHIndi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelHindi {

	WebDriver driver;
	@Test
	public void VerifyTitel() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

	@Test
	public void VerifyLogo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		
		WebElement logo=	driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}