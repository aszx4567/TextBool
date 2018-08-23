package Cheapter07;

abstract class Player{             //추상 클래스 : abstract 메소드를 하나라도 포함하는 클레스
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{              //일반 클래스         
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
