package Selenium_Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(src,new File("C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\ScreenShot\\error.png"));
		
		
		driver.close();
		driver.quit();

	}

}
