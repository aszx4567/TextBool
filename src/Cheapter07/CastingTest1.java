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
		car = fe;                //car = (Car)fe; 에서 형변환이 생략된상태
//    car.water();      //Car타입의 참조변수로는 water을 호출할수 없다.
		fe2 = (FireEngine)car;  //자손타입 <- 조상타입
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
