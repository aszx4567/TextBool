package Cheapter07;

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new FireEngine();  
		Car car2 = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
		
		fe.water();
		car = fe;                //car = (Car)fe; ���� ����ȯ�� �����Ȼ���
//    car.water();      //CarŸ���� ���������δ� water�� ȣ���Ҽ� ����.
		fe2 = (FireEngine)car;  //�ڼ�Ÿ�� <- ����Ÿ��
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive");
	}
	
	void stop(){
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println(" water!");
	}
}
