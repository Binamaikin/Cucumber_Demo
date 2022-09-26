package TestNGHIndi;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.Cookie;

public class Cokkis {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	Set<org.openqa.selenium.Cookie> cookiesList =	driver.manage().getCookies();
	System.out.println(cookiesList.size());
	
	for (org.openqa.selenium.Cookie ck:cookiesList) {
		System.out.println(ck.getName() +" :"+ ck.getValue());
	}
	
	driver.close();
	driver.quit();
	
	
	}

}
