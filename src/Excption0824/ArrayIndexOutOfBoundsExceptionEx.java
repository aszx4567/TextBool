package Excption0824;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		String data [ ] = { "a","b","c" };
		
		try{
			System.out.println(data[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("÷�ں����� �߸��Ǿ����ϴ�.");
		}
	}

}
