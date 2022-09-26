package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	public WebDriver idriDriver;
	
	public AddCustomerPage(WebDriver rdrDriver)
	{
		
		idriDriver=rdrDriver;
		PageFactory.initElements(idriDriver, this);
	}

	
}
