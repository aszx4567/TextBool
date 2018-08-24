package Excption0824;

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account();
		//예금하기
		ac.deposite(10000);
		System.out.println("예금액 : " + ac.getBalance());
		
		//출금하기
		try{
			ac. widthdraw(30000);
		}catch(BalanceInsufficientException e){
			String massage = e. getMessage();
			System.out.println(massage);;
			System.out.println();;
			e.printStackTrace();
		}
	}

}
