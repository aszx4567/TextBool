package Cheapter07;

class tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class CaptionTv extends tv {
	boolean caption; //ĸ�ǻ��� on/off
	void displayCaption(String text) {
		if (caption) {         //ĸ�ǻ��°� on(true)�� ���� text�� �����ش�
			System.out.println(text);
		}
	}
}
public class Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world");
		ctv.caption = true;    //ĸ��[�ڸ�] ������ �Ҵ�
		ctv.displayCaption("Hello, caption");

	}

}
