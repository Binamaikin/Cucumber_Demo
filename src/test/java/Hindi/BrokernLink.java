package Hindi;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokernLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Cucumber_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.deadlinkcity.com");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int brokenLinkCnt=0;
		int rescode = 200;
		
		System.out.println("Total Links on page" +linklist.size());
		for (WebElement element:linklist)
		{
		String url = element.getAttribute("herf");
		try {
			URL  urlLink= new URL(url);
		
			HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			rescode = huc.getResponseCode();
			
			if (rescode >=400)
			{
				System.out.println(url+"broken.link.");
				brokenLinkCnt ++;
			}
		}
		
		
		catch (MalformedURLException e) {
			
		}
		catch (Exception e) {
			{
			}
			}

System.out.println("Total Broken Links:"+brokenLinkCnt);		
		
		}
		
	}

}
