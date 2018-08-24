package Example0824;

public class Television implements RemoteControl {
	private int volume;
	
	//interface 의 turnOn메소드를 구현
	public void turnOn(){
		System.out.println("텔레비전을 켭니다.");
	}
	//interface 의 turnOff메소드를 구현
	public void turnOff(){
		System.out.println("텔레비전을 끕니다.");
	}
	//interface의 void setVolume(int volume)구현
	public void setVolume(int volume){	     
		if(volume > RemoteControl.MAX_VOLUME ){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("현제 TV불륨 : " + volume);
	}
	
	public static void main(String[] args) {
		
	}
}
