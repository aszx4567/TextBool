package Example0824;

public interface RemoteControl {
	// ����� �߻�(abstract)�޼ҵ常 ������ �� �ִ�.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volumne);
	
	//default method
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���Ұ� �մϴ�.");
		}else{
			System.out.println("���ҰŸ� �����մϴ�");
		}
	}//end setMute
	
	//static method
	static void changeBettery(){
		System.out.println("���͸��� ��ü�մϴ�");
	}// end changeBettery
}//end RemoteControl interface
