package Cheapter06;

public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(string[] args) ��(��) ���۵�");
		firstMethod();
		System.out.println("main(string[] args) ��(��) ����");

	}
	static void firstMethod(){
		System.out.println("firstmethod�� ���۵�");
		secondMethod();
		System.out.println("firstmethod�� ����");
	}
	static void secondMethod(){
		System.out.println("second�� ���۵�");
		System.out.println("������޼ҵ����ϴ���");
		threeMethod();
		System.out.println("������޼ҵ尡 ��������");
		System.out.println("second�� ����");
	}
	static void threeMethod(){
		System.out.println("three�� ������");
	}

}
