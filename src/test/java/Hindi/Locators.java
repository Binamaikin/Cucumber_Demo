package Hindi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		String currentwindowhandl = driver.getWindowHandle();
		driver.switchTo().window(currentwindowhandl);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		Thread.sleep(1000);
		
		
				
		
		driver.close();
		driver.quit();
	
	}

}
