package Cheapter05;

public class Tex10 {
	//스트링 클래스 가 같은지 다른지 비교하는 메소드 예제

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println( str.compareTo(anotherString));  //str과 anotherString가 같은가?
		System.out.println( str.compareToIgnoreCase(anotherString)); //str과 anotherString가 다른가?
		System.out.println( str.compareTo(objStr.toString()));; //str과 objStr 과 같은가?
		
		String s1 = "greencomputer";
		String s2 = "greencomputer";
		String s3 = new String ("Green Computer");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		

	}

}
