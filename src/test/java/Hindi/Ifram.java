package Hindi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Acer\\\\eclipse-workspace\\\\Cucumber_Demo\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	driver.switchTo().frame("moneyifram");
String nse=	driver.findElement(By.id("nseindex")).getText();
	System.out.println(nse);
		
//		driver.switchTo().frame("moneyiframe");
//		
//	String nse=	driver.findElement(By.id("nseindex")).getText();
//		System.out.println(nse);	
	
	driver.switchTo().defaultContent();
	
int noofiframes =	driver.findElements(By.tagName("iframe")).size();
	System.out.println("no of iframes:"+ noofiframes);
		
		driver.close();
		driver.quit();

	}

}
