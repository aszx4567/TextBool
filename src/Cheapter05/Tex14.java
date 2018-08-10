package Cheapter05;

public class Tex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String.toUpper 대문자를 소문자로 소문자를 대문자로 바꾸어줍니다
		String str ="string abc touppercase ";
		String strUpper = str.toUpperCase();
		System.out.println("Original String : "+str);
		System.out.println("String changed to upper case : "+strUpper);
		
		//String.regionMatches - 두개의 String[문자열] 이 같은지 아닌지 판별합니다.
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with Microsoft";
		boolean match = first_str.regionMatches(11, second_str, 12, 9);
		System.out.println("first_str[11 - 19] == second_str[12 - 21] : "+match);
		
		//출력 형식을 지정해줍니다.
		String name = "Hello World";
		String s1 = String.format("name %s", name);  //%s  name 라는 변수를 String로 취급
		String s2 = String.format("value %f", 32.33434); //$f 변수를 실수형 숫자로 취급
		String s3 = String.format("value %32.12f", 32.33434); //%32.12f 소숫점이하12자리로 취급
		String s4 = String.format("value %x", 37); //%x 16진수로 취급;  
		System.out.println(s1);
		System.out.println("\n");
		System.out.println(s2);
		System.out.println("\n");
		System.out.println(s3);
		System.out.println("\n");
		System.out.println(s4);
		System.out.println("\n");
		
	}

}
