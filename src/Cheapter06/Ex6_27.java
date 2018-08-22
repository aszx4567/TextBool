package Cheapter06;

public class Ex6_27 {

	static {
		System.out.println("static ( )");  //클레스 초기화 블럭
	}
	{
	 System.out.println("(  )");  //인스턴스 초기화 블럭
	}
	public  Ex6_27  () {
		System.out.println("생성자");     //생성자는 클레스 이름과 같아야함 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt = new BlockTest (); ");
		 Ex6_27  bt = new  Ex6_27 ();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		 Ex6_27  bt2 = new  Ex6_27 ();

	}

}
