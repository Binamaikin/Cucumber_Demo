package TestNGHIndi;

import org.testng.annotations.Test;

public class EnabelANDDesebel {

	@Test(enabled=false)
	public void MobileLoginPersonalLoan() {
		System.out.println("MobileLoginPersonalLoan");
	}
	
	
	@Test(enabled=false)
	public void WebLoginPersonalLoan() {
		System.out.println("WebLoginPersonalLoan");
}

	@Test(enabled=false)
	public void APILoginPersonalLoan() {
		System.out.println("APIoginPersonalLoan");
		}

	@Test
	public void MobileLoginAutoMobileLoan() {
		System.out.println("MobileLoginAutoMobileLoan");
}

	@Test
	public void WebLoginAutoMobileLoan() {
		System.out.println("WebLoginAutoMobileLoan");
}

	@Test
	public void APILoginAutoMobileLoan() {
		System.out.println("APILoginAutoMobileLoan");
	}
}

