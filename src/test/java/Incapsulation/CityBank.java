package Incapsulation;

public class CityBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralBank c1=new CentralBank();
		
//		System.out.println(c1.intrate);
//		c1.intrate="10%";
//		System.out.println(c1.intrate);
//		
		
		c1.setintrate(1122,"12%");
		
		c1.deposit();
		c1.Withdraw();
		c1.getintrate();
		
	}

}
