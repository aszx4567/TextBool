package Excption0824;

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account();
		//�����ϱ�
		ac.deposite(10000);
		System.out.println("���ݾ� : " + ac.getBalance()+"��");
		
		//����ϱ�
		try{
			ac. withdraw(30000);
		}catch(BalanceInsufficientException e){
			String massage = e. getMessage();
			System.out.println(massage);;
			System.out.println();;
			e.printStackTrace();
		}
	}

}
