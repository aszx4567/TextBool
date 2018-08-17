package Cheapter06;
//static method

class t {
	int inst_a = 50;                //인스턴스변수
	static int class_a = 100;  //클레스변수
	
	void inst_get(){                      //인스턴스메서드
		System.out.println("inst_get() : " + inst_a);
	}
	static void class_get(){         //클레스메서드
		System.out.println("class_get() : " + class_a);
	}
}//end class t

public class Tex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 1. 인스턴스화 시키지 않고 인스턴스 메서드를 호출  예상결과 : 오류
		// t.inst_get();  //static이 붙지 않은 인스턴스 메서드 이기 때문에 다른 클래스인  Tex1에서는 실행 불가
		//test 2. 인스턴스화 시키지 않고 클래스 메서드를 호출 예상결과 : 오류없이 실행가능
		t.class_get(); //static이 붙은 클래스 메서드기 때문에 다른 클래스인 Tex1에서 실행가능
		
		// test 3. 인스턴스화 하고 test 1 을 똑같이 한번 더
		t in1 = new t();
		in1.inst_get();
		//객체(in1)이 만들어 졌을때(인스턴스화 됐을때) 실행 될 수 있다
        
	}

}
