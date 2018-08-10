/*
 * cheongju green computer, 2018-08-09
 * array output with arrays.toString()
 * Arrays.toString() 메소드를 이용하여 배열요소 출력하기
 * Source : TextBook page 191
*/
package Cheapter05;

import java.util.*;

public class Ex5_2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];                  //배열선언
		int[] iArr2 = new int [10];                 //배열선언
		int[] iArr3 = {100, 95, 80, 70, 60};       //선언 및 초기화
		char[] chArr = { 'a', 'b', 'c', 'd'};           //선언 및 초기화
		
		// 배열 초기화하는 또 다른 방법... for loop 을 이용 값 대입
		// 배열참조변수.length : 배열의 크기
		for(int i =0 ; i <iArr1.length; i++){
			iArr1[i] = i + 1; //1~10의 숫자를 배열에 대입
		}
		
		for(int i =0 ; i <iArr2.length; i++){
			iArr2[i] = (int)(Math.random()*10)+1;   //random()함수는 0.0 <=  x  <1.0 이기 때문에 *10을 해서 0~9가 만들어짐
		}                                                        // +1 을 하면 1부터 10까지의 숫자가 만들어진다.
		
		// 이제 배열에 저장된 값을 출력해보자.
		for( int i =0; i <iArr1.length; i++){
			System.out.print(iArr1[i]+"  ");
		} System.out.println();
		// println()의 패러미터로 Arrays.toString() 을 사용
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		// println()의 패러미터로 배열참조변수를 직접 사용
		System.out.println(iArr3);
		System.out.println(chArr); 

	}//end main

}//end class
