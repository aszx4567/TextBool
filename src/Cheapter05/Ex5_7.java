package Cheapter05;

import java.util.Arrays;

public class Ex5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++){
			numArr[i] = i;  //�迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
		    System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i =0; i < numArr.length; i++){
			int n = (int)(Math.random() *10);  // 0~9���� �� ���� ���Ƿ� ��´�.
			int tmp = numArr[0];         //numArr[0] �� numArr[n] ���� ���� �ٲ۴�
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));

	}// end main

}
