package Cheapter05;

import java.util.*;

public class DarrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float avg = 0.0f;
		int kor =0, eng =0, mat =0;
		int score [][] = { 
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		for(int i =0; i<score.length; i++){
			sum =0;
			for(int j=0; j<score[i].length ; j++){
				System.out.printf("%5d",score[i][j]);
				sum = sum + score[i][j];
			}
			System.out.printf("%7d", sum);
			avg = sum/3;
			System.out.printf("%7.1f",avg);
			System.out.println();	
		}
		for(int i =0; i<score.length; i++){
			kor += score[i][0];
			eng += score[i][1];
			mat += score[i][2];
		}
		System.out.print("±¹¾î ÃÑÁ¡ = "+kor);
		System.out.print(" ¿µ¾î ÃÑÁ¡ = "+eng);
		System.out.print(" ¼öÇÐ ÃÑÁ¡ = "+mat);
		System.out.println();
	}//end main

}//end class


