package Hindi;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		//Singel Click
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
//		
//		Actions act = new Actions(driver);
//		act.contextClick(button).perform();
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		

	}

}
