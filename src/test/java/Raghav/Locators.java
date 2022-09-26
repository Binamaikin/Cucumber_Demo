package Raghav;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://portal.saif-zone.com/Login.aspx?ReturnURL=http://portal.saif-zone.com/default.aspx")
		;
		//driver.findElement(By.id("phTopPane_txtUserName")).sendKeys("jachsinternational@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phTopPane_txtUserName\"]")).sendKeys("jachsinternational@gmail.com");
		driver.findElement(By.cssSelector("#phTopPane_txtPassword")).sendKeys("Bina@8108");
		driver.findElement(By.id("phTopPane_btnLogin")).submit();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();		
	}

}
