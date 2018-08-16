package Cheapter05;

public class Çà¿­Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1[][] ={
				{3,4,5},
				{4,5,6},
				{5,6,7}
		 };
		int sum2[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		}; 
		int sum3[][] = new int [3][3];
		for(int i =0; i < sum1.length; i++){
			for(int j =0; j <sum1[i].length ; j++){
				sum3[i][j] = sum1[i][j]+sum2[i][j];
			}
		}
		for(int i =0; i < sum3.length; i++){
			for(int j =0; j <sum3[i].length ; j++){
				System.out.printf("%5d",sum3[i][j]);
			}System.out.println();
		}
		//Çà¿­ÀÇ °ö¼À
		//00*00 + 01*10 + 02*20      00*01 + 01*11 + 02*21
		//10*00 + 11*10 + 12*20      10*01 + 11*11 + 12*21
		int ma[][] = {
				{3,4,5},
				{4,5,6}
		};
		int mb[][] = {
				{1,2},
				{4,5},
				{7,8}
		};
		int row = ma.length;
		int col = mb[0].length;
		int mb_row = mb.length;
		System.out.printf("%5d,%5d,%5d",row, col, mb_row);
		int mc[][]= new int [row][col];
		
		for(int i =0; i < row ;  i++){
			for(int j =0;  j<col; j++){
				for(int k =0; k< mb_row;  k++){
					//System.out.printf("%3d %3d %3d",  i, j, k);
					mc[i][j] += ma[i][k] * mb[k][j];
				}
				System.out.println();
			}
		}
		for(int i =0; i < row; i++){
			for(int j =0; j < col ; j++){
				System.out.printf("%3d",mc[i][j]);
			}System.out.println();
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}//end main
}//end class


