package Ifram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
	String nse=	driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(nse);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("body > div.navbar > ul > li.sports > a")).click();
		driver.close();
		driver.quit();
	}

}
