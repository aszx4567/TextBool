package Cheapter06;

class Data{
	int x;
}

public class Ex6_9 {    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x =" + d.x);

	}
	static void change(Data d){        //��ȣ�ȿ� int x�� �⺻���Ű�����  Data d�� �������Ű����� �̴�
		d.x = 1000;                                    // int x - �⺻���Ű������� �Ұ�� main���� change�żҵ带 �ҷ��� �� ��ɸ� ����ǰ� ���ư���.
		                                                         //Data d - ������ �Ű������� �� ��� main���� �żҵ带 �ҷ����� ��� �����ȴ�. 
		System.out.println("change() : " +d.x);
	}

}
