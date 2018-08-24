package Example0824;

public class Audio implements RemoteControl{
private int volume;
private boolean mute;
	
	//interface 의 turnOn메소드를 구현
	public void turnOn(){
		System.out.println("오디오를 켭니다.");
	}
	//interface 의 turnOff메소드를 구현
	public void turnOff(){
		System.out.println("오디오를 끕니다.");
	}
	//interface의 void setVolume(int volume)구현
	public void setVolume(int volume){	
		if(volume > RemoteControl.MAX_VOLUME ){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}System.out.println("현제 오디오불륨 : " + volume);
	}
	
	//default method를 변경해서 setMUte를 정의
	//override
		public void setMute(boolean mute){
			if(mute){
				System.out.println("오디오를 음소거 합니다.");
			}else{
				System.out.println("오디오를 음소거 해제합니다");
			}
		}//end setMute

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
