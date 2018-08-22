
package Cheapter06;

class TV{
	//TV의 속성을 리스팅한다.
	String color;
	boolean power ;
	int channel ;
	String maker;
	static int tax;
	
	static void set_tax(int p_tax){
		tax = p_tax;
	}
	static void get_tex(){
		System.out.println("tax : " + tax);
	}
	// constructor 생성자  //객체가 생성될때 초기값을 설정하거나 필요한 자원을 할당할때 사용한다.
	TV(String p_maker){          //보통 생성자는 클래스이름과 같이 쓴다
		power = false;
		channel =1;
		maker = p_maker;
		//System.out.println("TV객체가 생성되었습니다");
	}
	
	void chkMaker(){
		System.out.println("Maker : " +maker);
	}
	//TV의 기능적 측면을 정의한다.
	void power(){
		power = !power;
		if(power){
			System.out.println("Power Status : ON");
		}
		else {
			System.out.println("Power Status : OFF");
		}
	} //토글시키는 형태 켜잇으면끄고 꺼잇으면 키도록
	void channelUp(){
		if(power){
		++channel;
		System.out.println("Channel : " + channel);
		}else{
			System.out.println("Now, Tv is OFF!");
		}
	} //채널 1증가
	void channelDown(){
		if(power){
		--channel;
		System.out.println("Channel : " + channel);
		}else{
			System.out.println("Now, Tv is OFF!");
		}
	} //채널 1감소
	
	// 채널 셋하기
	void setChannel(int p_channel){
		if(power){
			channel = p_channel;
			System.out.println("Channel : " + channel);
		}else{
			System.out.println("Now, Tv is OFF! I can't set channel ");
		}
	}
	void chkChannel(){
		System.out.println("Current Channel is : " +channel );
	}
	
}//end classTV

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV("SAMSUNG");
		tv1.chkMaker();
		tv1.set_tax(2000);
		tv1.get_tex();
		
		TV tv2 = new TV("LG Electronics");
		tv2.chkMaker();
		tv2.get_tex();
		
		tv1.power ();
		tv2.power();
		
		tv1.setChannel(11);
		tv2.setChannel(24);
		
		tv1.channelUp();
		tv2.channelUp();
		
		tv1.chkChannel();
		tv2.chkChannel();

		tv1.power();
		tv2.power();	

	}//end main

}//end class Ex6_1
