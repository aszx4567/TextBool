package Cheapter05;

public class Tex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명령이 실행되는 시간을 나타냄 
		String variables[] = new String[50000];
		for(int i =0; i<50000; i++){
			variables[i] = "s"+i;
		}
		long startTime0 = System.nanoTime();//현제시간을 ms로 읽어와라
		
		for(int i =0; i<50000;i++){
			variables[i] = "hello";
		}
		long endTime0 = System.nanoTime();
		System.out.println("Creation time of String literals : "+(endTime0 - startTime0)+"nano s");
		
		long startTime2 = System.currentTimeMillis();
		for(int i =0;i<50000;i++){
			variables[i] =new String("hello");
			variables [i] = variables[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("3번 시간 : "+(endTime2 - startTime2)+"ms");
	}

}
