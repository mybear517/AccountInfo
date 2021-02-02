public class SavingAc extends BankAccount {
	private double rateofInterest;

	public SavingAc() {
		this(0, "", 0, 0); // calling same class constructor
		rateofInterest = 0.00;
	}
	
	public SavingAc(int accNo, String name, double amt, double iRate) {
		super(accNo, name, amt); // calling super class ctor
		rateofInterest = iRate;
	}
	
	public double getRateofInterest() {
		return rateofInterest;
	}

	public void setRateofInterest(double rateofInterest) {
		this.rateofInterest = rateofInterest;
	}
}