package Cheapter05;

public class Tex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linear search 선형탐색  모든값을 비교한다.
		int[] a = { 2 ,5, -2, 6, -3,8, 0, -7, -9, 4 };
		int target = 0;
		
		for(int i =0; i< a.length; i++){
			if(a[i] == target){
				System.out.println("Element found ataindex "+i);
				break;
			}
		}
		

	}

}
