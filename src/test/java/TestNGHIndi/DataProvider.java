package TestNGHIndi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name= "searchDataSet")
	public Object[][] searchdata(){
		Object[][] serchkeyword = new Object[3][2];
		serchkeyword [0] [0] = "India";
		serchkeyword [0] [1] = "Qutub Minar";
		
		serchkeyword [1] [0] = "Agra";
		serchkeyword [1] [1] = "Taj Mahal";
	
		serchkeyword [2] [0] = "Hyderabad";
		serchkeyword [2] [1] = "Char Minar";
		
		return serchkeyword;
	
	}
	
	@Test(dataProvider = "searchDataSet")
	public void TestCaseGoogelSearch(String country, String mounument) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement searhchbox = driver.findElement(By.id("q"));
		searhchbox.sendKeys(country+ " " + mounument);
		
		
		driver.findElement(By.name("btnk")).submit();
	
	
	}

}
