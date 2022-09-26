package TestNGHIndi;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHIndi {


	
	@org.testng.annotations.Test
	public void verifyPageTitel() {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("");
		String	expectedTitle= "Google";
		String actualTitle = driver.getTitle();
		
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		
		
		driver.close();
		driver.quit();





	}
}