package Example0824;

public interface RemoteControl {
	// 상수와 추상(abstract)메소드만 선언할 수 있다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volumne);
	
	//default method
	default void setMute(boolean mute){
		if(mute){
			System.out.println("음소거 합니다.");
		}else{
			System.out.println("음소거를 해제합니다");
		}
	}//end setMute
	
	//static method
	static void changeBettery(){
		System.out.println("배터리를 교체합니다");
	}// end changeBettery
}//end RemoteControl interface
