package Cheapter05;

import java.util.Scanner;

public class Ex5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		int x = 0, y =0;
		
		char[][] board = new char [10][10];
		byte[][] shipBoard = {
				{0,0,0,0,0,0,1,0,0},
				{1,1,1,1,0,0,1,0,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,0,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,1,1,1,0},
		};
		//1행에 행번호, 1열에 열번호 저장
		for(int i =0; i<size;i++)
			board[0][i] = board[i][0] = (char)(i+'0');  //'0' 은 아스키코드값 48  1+'0' = 아스키49 = 숫자1  ~ 숫자2는 아스키50 ~~~
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.printf("좌표를입력해주세요. (종료는 00)>");
			String input = scan.nextLine();
			
			if(input.length()==2){
				x = input.charAt(0) - '0';    //=문자열로 받아온 숫자를 진짜숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0){
					System.out.println("종료합니다");
					break;
				}			
			}
			if(input.length()!=2 || x<=0 || x>=size || y<=0 || y>=size){
				System.out.println("잘못입력하셧습니다. 다시입력해주세요");
				continue;
			}
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';   //식 ? 참일때반환 : 거짓일때반환 
			for(int i =0; i<size ; i++)
				System.out.println(board[i]);
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
	}

}
