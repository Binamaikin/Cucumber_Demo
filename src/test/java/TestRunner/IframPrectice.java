package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframPrectice {


	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		//driver.switchTo().frame("moneyiframe");
		
		//driver.switchTo().frame("0");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
		String nse=driver.findElement(By.id("nseindex")).getText();
		System.out.println(nse);
		
		
		
		
		driver.close();
		driver.quit();

	}

}
