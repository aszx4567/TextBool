package Cheapter07;

abstract class Player{             //�߻� Ŭ���� : abstract �޼ҵ带 �ϳ��� �����ϴ� Ŭ����
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{              //�Ϲ� Ŭ����         
	void play(int pos){
		System.out.println("general class");
	}
	void stop(){
		System.out.println("stop");
	}
}

abstract class TestAbstract extends Player{

	public static void main(String[] args) {
		//Player p1 = new Player();
		AudioPlayer p2 = new AudioPlayer();
	}
	void play(int pos) {
			System.out.println("general class");
    }	
    

}
