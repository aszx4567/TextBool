package Cheapter06;
//static method

class t {
	int inst_a = 50;                //�ν��Ͻ�����
	static int class_a = 100;  //Ŭ��������
	
	void inst_get(){                      //�ν��Ͻ��޼���
		System.out.println("inst_get() : " + inst_a);
	}
	static void class_get(){         //Ŭ�����޼���
		System.out.println("class_get() : " + class_a);
	}
}//end class t

public class Tex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 1. �ν��Ͻ�ȭ ��Ű�� �ʰ� �ν��Ͻ� �޼��带 ȣ��  ������ : ����
		// t.inst_get();  //static�� ���� ���� �ν��Ͻ� �޼��� �̱� ������ �ٸ� Ŭ������  Tex1������ ���� �Ұ�
		//test 2. �ν��Ͻ�ȭ ��Ű�� �ʰ� Ŭ���� �޼��带 ȣ�� ������ : �������� ���డ��
		t.class_get(); //static�� ���� Ŭ���� �޼���� ������ �ٸ� Ŭ������ Tex1���� ���డ��
		
		// test 3. �ν��Ͻ�ȭ �ϰ� test 1 �� �Ȱ��� �ѹ� ��
		t in1 = new t();
		in1.inst_get();
		//��ü(in1)�� ����� ������(�ν��Ͻ�ȭ ������) ���� �� �� �ִ�
        
	}

}
