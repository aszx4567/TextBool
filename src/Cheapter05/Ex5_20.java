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
		//1�࿡ ���ȣ, 1���� ����ȣ ����
		for(int i =0; i<size;i++)
			board[0][i] = board[i][0] = (char)(i+'0');  //'0' �� �ƽ�Ű�ڵ尪 48  1+'0' = �ƽ�Ű49 = ����1  ~ ����2�� �ƽ�Ű50 ~~~
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.printf("��ǥ���Է����ּ���. (����� 00)>");
			String input = scan.nextLine();
			
			if(input.length()==2){
				x = input.charAt(0) - '0';    //=���ڿ��� �޾ƿ� ���ڸ� ��¥���ڷ� ��ȯ
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0){
					System.out.println("�����մϴ�");
					break;
				}			
			}
			if(input.length()!=2 || x<=0 || x>=size || y<=0 || y>=size){
				System.out.println("�߸��Է��ϼ˽��ϴ�. �ٽ��Է����ּ���");
				continue;
			}
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
			for(int i =0; i<size ; i++)
				System.out.println(board[i]);
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
	}

}
