/*
 * cheongju green computer, 2018-08-09
 * array output with arrays.toString()
 * Arrays.toString() �޼ҵ带 �̿��Ͽ� �迭��� ����ϱ�
 * Source : TextBook page 191
*/
package Cheapter05;

import java.util.*;

public class Ex5_2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];                  //�迭����
		int[] iArr2 = new int [10];                 //�迭����
		int[] iArr3 = {100, 95, 80, 70, 60};       //���� �� �ʱ�ȭ
		char[] chArr = { 'a', 'b', 'c', 'd'};           //���� �� �ʱ�ȭ
		
		// �迭 �ʱ�ȭ�ϴ� �� �ٸ� ���... for loop �� �̿� �� ����
		// �迭��������.length : �迭�� ũ��
		for(int i =0 ; i <iArr1.length; i++){
			iArr1[i] = i + 1; //1~10�� ���ڸ� �迭�� ����
		}
		
		for(int i =0 ; i <iArr2.length; i++){
			iArr2[i] = (int)(Math.random()*10)+1;   //random()�Լ��� 0.0 <=  x  <1.0 �̱� ������ *10�� �ؼ� 0~9�� �������
		}                                                        // +1 �� �ϸ� 1���� 10������ ���ڰ� ���������.
		
		// ���� �迭�� ����� ���� ����غ���.
		for( int i =0; i <iArr1.length; i++){
			System.out.print(iArr1[i]+"  ");
		} System.out.println();
		// println()�� �з����ͷ� Arrays.toString() �� ���
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		// println()�� �з����ͷ� �迭���������� ���� ���
		System.out.println(iArr3);
		System.out.println(chArr); 

	}//end main

}//end class
