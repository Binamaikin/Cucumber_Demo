package Hindi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("total links on webpage:"+ linkElements.size());
		
		for (WebElement el:linkElements);
		{
		System.out.println(linkElements);
		}
		
		

		driver.close();
		driver.quit();

	}

}
