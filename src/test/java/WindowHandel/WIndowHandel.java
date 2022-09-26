package WindowHandel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a"));
		Thread.sleep(5000);
		String parentWindow=driver.getWindowHandle();
		Set<String> CWs=driver.getWindowHandles();
		
		Iterator<String> i=CWs.iterator();
		
		while(i.hasNext()){
			
		String childWindow=i.next();
		System.out.println(childWindow);
		if (!parentWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			
			Thread.sleep(5000);
			driver.close();
			
		}
		
			
			
		}
	
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		driver.close();
		driver.quit();

	}

}
