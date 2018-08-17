package Cheapter06;

class MyMath {
	long add(long a, long b){
		long result = a+b;
		return result;     //간단히 return a + b 로 가능
	}
	
	long subtract(long a, long b){
		return a-b;
	}
	long multiply(long a, long b){
		return a * b;
	}
	double divide(double a, double b){
		return a / b;
	}
}

public class Ex6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);   //long로 호출하기
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("subtract(5L, 3L) ="+result2);
		System.out.println("multuply(5L, 3L) = "+result3);
		System.out.println("divide(5L, 3L) = "+result4);

	}

}
