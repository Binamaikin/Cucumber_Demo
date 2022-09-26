package Incapsulation;

public class CentralBank {

private	String intrate="8%";
private int passcode;
	
	public void deposit() {
		System.out.println("Deposit the Amount");
	}
	
	public void Withdraw() {
		System.out.println(" Withdraw the Amount");
	}

	public void getintrate() {
		System.out.println(intrate);
	}
	

	public void setintrate(String newintrate) {
		if (passcode==1122) {
			intrate=newintrate;
		}
	}

	public void setintrate(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}


