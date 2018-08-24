package Example0824;

public class RemoteControlUse {

	public static void main(String[] args) {
		//RemoteControl rc = null;  //인터페이스 변수 선언
		//rc = new Television();      //텔레비전 객체를 인터페이스 변수에 대입
		
		//인터페이스 배열로 구현 객체 관리하기
		RemoteControl rc[] = {
				new Television(),
				new Audio(),
		};
		
		rc[0].turnOn();
		rc[0].setMute(true);              //default 메소드 사용
		rc[0].setVolume(5);
		rc[0].setVolume(6);
		rc[0].turnOff();
		RemoteControl.changeBettery();      //배터리메소드는 static 이라서 rc.이 아니라 RemoteControl.changeBettery로 사용
		
		
		rc[1] = new Audio();    //오디오 객체를 인터페이스 변수에 대입
		
		rc[1].turnOn();
		rc[1].setMute(true);        //overrde된 dafault method 사용
		rc[1].turnOff();
		
		
	}// end main
}// end Use class
