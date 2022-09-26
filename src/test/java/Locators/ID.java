package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.id("srchword")).sendKeys("India");
		//driver.findElement(By.name("srchword")).sendKeys("India");
		//driver.findElement(By.cssSelector("#srchword")).sendKeys("Maikin");
		//driver.findElement(By.xpath("//*[@id=\"srchword\"]")).sendKeys("Parekh");
		driver.findElement(By.linkText("https://shopping.rediff.com/product/")).sendKeys("Maikin");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
