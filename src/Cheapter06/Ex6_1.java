package Cheapter06;

class TV{
	//TV�� �Ӽ��� �������Ѵ�.
	String color;
	boolean power ;
	int channel ;
	String maker;
	static int tax;
	
	static void set_tax(int p_tax){
		tax = p_tax;
	}
	static void get_tex(){
		System.out.println("tax : " + tax);
	}
	// constructor ������  //��ü�� �����ɶ� �ʱⰪ�� �����ϰų� �ʿ��� �ڿ��� �Ҵ��Ҷ� ����Ѵ�.
	TV(String p_maker){          //���� �����ڴ� Ŭ�����̸��� ���� ����
		power = false;
		channel =1;
		maker = p_maker;
		//System.out.println("TV��ü�� �����Ǿ����ϴ�");
	}
	
	void chkMaker(){
		System.out.println("Maker : " +maker);
	}
	//TV�� ����� ������ �����Ѵ�.
	void power(){
		power = !power;
		if(power){
			System.out.println("Power Status : ON");
		}
		else {
			System.out.println("Power Status : OFF");
		}
	} //��۽�Ű�� ���� ����������� �������� Ű����
	void channelUp(){
		if(power){
		++channel;
		System.out.println("Channel : " + channel);
		}else{
			System.out.println("Now, Tv is OFF!");
		}
	} //ä�� 1����
	void channelDown(){
		if(power){
		--channel;
		System.out.println("Channel : " + channel);
		}else{
			System.out.println("Now, Tv is OFF!");
		}
	} //ä�� 1����
	
	// ä�� ���ϱ�
	void setChannel(int p_channel){
		if(power){
			channel = p_channel;
			System.out.println("Channel : " + channel);
		}else{
			System.out.println("Now, Tv is OFF! I can't set channel ");
		}
	}
	void chkChannel(){
		System.out.println("Current Channel is : " +channel );
	}
	
}//end classTV

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV("SAMSUNG");
		tv1.chkMaker();
		tv1.set_tax(2000);
		tv1.get_tex();
		
		TV tv2 = new TV("LG Electronics");
		tv2.chkMaker();
		tv2.get_tex();
		
		tv1.power ();
		tv2.power();
		
		tv1.setChannel(11);
		tv2.setChannel(24);
		
		tv1.channelUp();
		tv2.channelUp();
		
		tv1.chkChannel();
		tv2.chkChannel();

		tv1.power();
		tv2.power();	

	}//end main

}//end class Ex6_1
