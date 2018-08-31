package Excption0824;

public class Account {
	private long balance;
	
	public Account(){}
	
	public long getBalance(){
		return balance;
	}
	
	public void deposite(int money){
		balance += money;
	}
	
	public void withdraw(int money)
	      throws BalanceInsufficientException{
		if(balance < money){
			throw new BalanceInsufficientException("잔고부족   " + (money-balance)+"원모자람");
		}
		balance -= money;
	}
}
