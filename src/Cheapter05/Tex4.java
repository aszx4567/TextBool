package Cheapter05;

import java.util.*;

public class Tex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[6];
		Arrays.fill(array, 100); //���100���ιٲٱ�
		
		System.out.println(Arrays.toString(array));
		Arrays.fill(array, 3, 6, 50);  //�ε��� 3���� 6���� 50���� �ٲٱ�
		System.out.println(Arrays.toString(array));

	}

}
