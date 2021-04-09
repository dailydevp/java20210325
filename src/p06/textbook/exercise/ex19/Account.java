package p06.textbook.exercise.ex19;

public class Account{
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1_000_000;
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
/*	
	public void setBalance(int balance) {
		if(balance>=0 && balance <= 1_000_000) {
		this.balance = balance;
		}
	}
*/		
	

//	public int setBalance() {
//		return price;
//}
//	public void getBalnce() {
//		if(price>0) {
//			this.price = 0;
//			return;
//		}else {
//			this.price = price;
//		}
//		
		
	}


