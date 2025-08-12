package Bank_Management_System;

public class Customers {

	private int AcountNO;
	private String Name;
	private String Email;
	private int Mobile;
	private String PANNO;
	private double balance;

	public Customers(int acountNO, String name, String email, int mobile, String pANNO, double balance) {
		super();
		this.AcountNO = acountNO;
		this.Name = name;
		this.Email = email;
		this.Mobile = mobile;
		this.PANNO = pANNO;
		this.balance = balance;
	}

	public int getAcountNO() {
		return AcountNO;
	}

	public void setAcountNO(int acountNO) {
		AcountNO = acountNO;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getMobile() {
		return Mobile;
	}

	public void setMobile(int mobile) {
		Mobile = mobile;
	}

	public String getPANNO() {
		return PANNO;
	}

	public void setPANNO(String pANNO) {
		PANNO = pANNO;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		
		return "Customers AcountNO=" + AcountNO + ", name=" + Name + ", Email=" + Email + ", Mobile=" + Mobile
				+ ", PANNO=" + PANNO + ", balance=" + balance + "]";
	}
	

}
