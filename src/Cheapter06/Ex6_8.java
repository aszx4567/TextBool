package Cheapter06;

public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(string[] args) 이(가) 시작됨");
		firstMethod();
		System.out.println("main(string[] args) 이(가) 끝남");

	}
	static void firstMethod(){
		System.out.println("firstmethod가 시작됨");
		secondMethod();
		System.out.println("firstmethod가 끝남");
	}
	static void secondMethod(){
		System.out.println("second가 시작됨");
		System.out.println("세컨드메소드일하는중");
		threeMethod();
		System.out.println("세컨드메소드가 일을끝냄");
		System.out.println("second가 끝남");
	}
	static void threeMethod(){
		System.out.println("three가 일했음");
	}

}
