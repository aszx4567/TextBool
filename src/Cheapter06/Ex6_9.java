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
	static void change(Data d){        //괄호안에 int x는 기본형매개변수  Data d는 참조형매개변수 이다
		d.x = 1000;                                    // int x - 기본형매개변수로 할경우 main에서 change매소드를 불러온 그 명령만 적용되고 날아간다.
		                                                         //Data d - 참조형 매개변수로 할 경우 main에서 매소드를 불러온후 계속 유지된다. 
		System.out.println("change() : " +d.x);
	}

}
