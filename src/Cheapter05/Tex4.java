package Cheapter05;

import java.util.*;

public class Tex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[6];
		Arrays.fill(array, 100); //모두100으로바꾸기
		
		System.out.println(Arrays.toString(array));
		Arrays.fill(array, 3, 6, 50);  //인덱스 3에서 6까지 50으로 바꾸기
		System.out.println(Arrays.toString(array));

	}

}
