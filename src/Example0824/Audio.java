package Example0824;

public class Audio implements RemoteControl{
private int volume;
private boolean mute;
	
	//interface �� turnOn�޼ҵ带 ����
	public void turnOn(){
		System.out.println("������� �մϴ�.");
	}
	//interface �� turnOff�޼ҵ带 ����
	public void turnOff(){
		System.out.println("������� ���ϴ�.");
	}
	//interface�� void setVolume(int volume)����
	public void setVolume(int volume){	
		if(volume > RemoteControl.MAX_VOLUME ){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}System.out.println("���� ������ҷ� : " + volume);
	}
	
	//default method�� �����ؼ� setMUte�� ����
	//override
		public void setMute(boolean mute){
			if(mute){
				System.out.println("������� ���Ұ� �մϴ�.");
			}else{
				System.out.println("������� ���Ұ� �����մϴ�");
			}
		}//end setMute

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
