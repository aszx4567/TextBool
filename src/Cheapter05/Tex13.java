package Cheapter05;
public class Tex13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse : "+string);
		System.out.println("String after reverse : "+reverse);
		
		//문자열 자르기 String.split  
		String str = "jan-feb-march-may";
		String[] temp;
		String delimeter = "-";     //delimeter = 구분자
		temp = str.split(delimeter);
		
		for(int i =0; i<temp.length ; i++){
			System.out.println(temp[i]);
			System.out.println("");
			str = "jan.feb.march.may";
			delimeter = "\\.";
			temp = str.split(delimeter);
		}
		System.out.println("------------");
		for(int i =0; i<temp.length; i++){
			System.out.println(temp[i]);;
			System.out.println("");
			temp = str.split(delimeter,3);
		}
		System.out.println("------------");
		for(int j =0; j<temp.length ; j++){
			System.out.println(temp[j]);
		}
	}
}