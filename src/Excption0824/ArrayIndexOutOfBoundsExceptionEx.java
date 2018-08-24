package Excption0824;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		String data [ ] = { "a","b","c" };
		
		try{
			System.out.println(data[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("첨자변수가 잘못되었습니다.");
		}
	}

}
