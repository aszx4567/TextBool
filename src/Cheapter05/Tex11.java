package Cheapter05;

public class Tex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ���ڿ����� �˻��ϱ�
		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		
		if(lastIndex == -1){
			System.out.println("Hello not found");
		}else{
			System.out.println("Last occurrence of Hello is at found");
		} 

	}

}
