package Cheapter05;

public class Tex10 {
	//��Ʈ�� Ŭ���� �� ������ �ٸ��� ���ϴ� �޼ҵ� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println( str.compareTo(anotherString));  //str�� anotherString�� ������?
		System.out.println( str.compareToIgnoreCase(anotherString)); //str�� anotherString�� �ٸ���?
		System.out.println( str.compareTo(objStr.toString()));; //str�� objStr �� ������?
		
		String s1 = "greencomputer";
		String s2 = "greencomputer";
		String s3 = new String ("Green Computer");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		

	}

}
