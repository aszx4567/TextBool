package Cheapter05;

public class Tex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binarySearch
		int[] a = { 3, 5, 6, 7, 8, 9, 10, 11, 13, 15};
		int low = 0, high =10;
		int target = 12;
		while(true){
			int mid = (low+high)/2;
			if(target == a[mid]){
				System.out.println(mid+"번째에 있네");
				break;
			}
			else if(target > a[mid]){
				low = mid;
			}else if(target < a[mid]){
				high = mid;
			}
		}

	}

}
