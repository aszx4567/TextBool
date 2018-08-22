package Cheapter07;

class tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class CaptionTv extends tv {
	boolean caption; //캡션상태 on/off
	void displayCaption(String text) {
		if (caption) {         //캡션상태가 on(true)일 때만 text를 보여준다
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
		ctv.caption = true;    //캡션[자막] 가능을 켠다
		ctv.displayCaption("Hello, caption");

	}

}
