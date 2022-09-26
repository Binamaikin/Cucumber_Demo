package Hindi;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("input-country"));
		
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("Iceland");
		//dropdown.selectByIndex(1);
		dropdown.selectByValue("99");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		if(dropdown.isMultiple()==true)
		{
			System.out.println("Drop Down is multiple");
		}
		else
		{
			System.out.println("Drop down is not multiple");
		}
		
		List<WebElement> alldropdownoptions= dropdown.getOptions();
		System.out.println("Total options:"+alldropdownoptions.size());
		for (WebElement el:alldropdownoptions)
		{
			System.out.println(el.getText());
		}
		
		driver.close();
		driver.quit();
	}

}
