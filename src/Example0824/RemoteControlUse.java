package Example0824;

public class RemoteControlUse {

	public static void main(String[] args) {
		//RemoteControl rc = null;  //�������̽� ���� ����
		//rc = new Television();      //�ڷ����� ��ü�� �������̽� ������ ����
		
		//�������̽� �迭�� ���� ��ü �����ϱ�
		RemoteControl rc[] = {
				new Television(),
				new Audio(),
		};
		
		rc[0].turnOn();
		rc[0].setMute(true);              //default �޼ҵ� ���
		rc[0].setVolume(5);
		rc[0].setVolume(6);
		rc[0].turnOff();
		RemoteControl.changeBettery();      //���͸��޼ҵ�� static �̶� rc.�� �ƴ϶� RemoteControl.changeBettery�� ���
		
		
		rc[1] = new Audio();    //����� ��ü�� �������̽� ������ ����
		
		rc[1].turnOn();
		rc[1].setMute(true);        //overrde�� dafault method ���
		rc[1].turnOff();
		
		
	}// end main
}// end Use class
