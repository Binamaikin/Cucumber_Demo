package Hindi;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.saucedemo.com/");


		Actions actions = new Actions (driver);

		org.openqa.selenium.interactions.Action seriosofAction= actions.moveToElement(driver.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user", Keys.TAB)
				.sendKeys("secret_sauce", Keys.ENTER).build();
		seriosofAction.perform();
		Thread.sleep(2000);
		
		
		driver.close();
		driver.quit();

	}
}
