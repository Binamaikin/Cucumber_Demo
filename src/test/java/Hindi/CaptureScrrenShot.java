package Hindi;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScrrenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/");
		
		
		
		
		File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src1,new File("C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\ScreenShot\\error1.png"));
			
		driver.close();
		driver.quit();
		
	}

	}


