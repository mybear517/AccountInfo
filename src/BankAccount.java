
public class BankAccount {
	 private int accNo;
	 private String name;
	 private double bal;
	
	 public BankAccount() {
		 accNo = 0;
		 name = "";
		 bal = 0;
	 }
	 	 
	 public BankAccount(int accNo, String name, double bal) {
		 this.accNo = accNo;
		 this.name = name;
		 this.bal = bal;
	 }
	 public int getAccNo() {
		return accNo;
	 }
	 public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
}
