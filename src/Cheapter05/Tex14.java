package Cheapter05;

public class Tex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String.toUpper �빮�ڸ� �ҹ��ڷ� �ҹ��ڸ� �빮�ڷ� �ٲپ��ݴϴ�
		String str ="string abc touppercase ";
		String strUpper = str.toUpperCase();
		System.out.println("Original String : "+str);
		System.out.println("String changed to upper case : "+strUpper);
		
		//String.regionMatches - �ΰ��� String[���ڿ�] �� ������ �ƴ��� �Ǻ��մϴ�.
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with Microsoft";
		boolean match = first_str.regionMatches(11, second_str, 12, 9);
		System.out.println("first_str[11 - 19] == second_str[12 - 21] : "+match);
		
		//��� ������ �������ݴϴ�.
		String name = "Hello World";
		String s1 = String.format("name %s", name);  //%s  name ��� ������ String�� ���
		String s2 = String.format("value %f", 32.33434); //$f ������ �Ǽ��� ���ڷ� ���
		String s3 = String.format("value %32.12f", 32.33434); //%32.12f �Ҽ�������12�ڸ��� ���
		String s4 = String.format("value %x", 37); //%x 16������ ���;  
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
