package Example0824;

public class Television implements RemoteControl {
	private int volume;
	
	//interface �� turnOn�޼ҵ带 ����
	public void turnOn(){
		System.out.println("�ڷ������� �մϴ�.");
	}
	//interface �� turnOff�޼ҵ带 ����
	public void turnOff(){
		System.out.println("�ڷ������� ���ϴ�.");
	}
	//interface�� void setVolume(int volume)����
	public void setVolume(int volume){	     
		if(volume > RemoteControl.MAX_VOLUME ){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("���� TV�ҷ� : " + volume);
	}
	
	public static void main(String[] args) {
		
	}
}
