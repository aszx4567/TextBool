package Cheapter05;

import java.util.Arrays;

public class Tex5 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		int index = Arrays.binarySearch(array,  2);       //array 배열에서  2 라는 숫자가 몇번째 인덱스에 있는지
		System.out.println("Found 2 @" + index);

	}

}
