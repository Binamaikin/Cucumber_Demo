package Hindi;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicityWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("START SELLING")).click();

		Stopwatch watch=null;
		try {
			watch= Stopwatch.createStarted();
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			element.click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+ "Seconds");
		}

		

		driver.close();
		driver.quit();



	}

}
