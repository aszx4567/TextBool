package Cheapter06;

public class Ex6_27 {

	static {
		System.out.println("static ( )");  //Ŭ���� �ʱ�ȭ ��
	}
	{
	 System.out.println("(  )");  //�ν��Ͻ� �ʱ�ȭ ��
	}
	public  Ex6_27  () {
		System.out.println("������");     //�����ڴ� Ŭ���� �̸��� ���ƾ��� 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt = new BlockTest (); ");
		 Ex6_27  bt = new  Ex6_27 ();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		 Ex6_27  bt2 = new  Ex6_27 ();

	}

}
