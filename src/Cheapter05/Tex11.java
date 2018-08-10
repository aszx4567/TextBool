package Cheapter05;

public class Tex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 문자열에서 검색하기
		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		
		if(lastIndex == -1){
			System.out.println("Hello not found");
		}else{
			System.out.println("Last occurrence of Hello is at found");
		} 

	}

}
