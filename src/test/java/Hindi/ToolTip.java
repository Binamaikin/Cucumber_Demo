package Hindi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.noon.partners/en/?domain=https://catalog.noon.partners/en-ae/catalog?limits=20&page=1");
		
	String Actualtooltip=	driver.findElement(By.xpath("//*[@id=\"formContainer\"]/div[1]/div/input")).getAttribute("title");
		String expectedToolTip= "title";
		
		if(Actualtooltip.equals(expectedToolTip))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test faild");
			
		}
	
	}

}
