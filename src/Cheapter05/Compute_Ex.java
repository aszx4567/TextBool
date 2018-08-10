package Cheapter05;

public class Compute_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op = args[1];
		int num2 = Integer.parseInt(args[2]);
		int num1 = Integer.parseInt(args[0]);
		System.out.println("숫자1 사칙연산기호 숫자2      이렇게 입력해 주세요");
		
		if(op == "+"){
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else if(op == "-"){
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}else if(op == "*"){
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}else if(op== "/"){
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}else{
			System.out.println("연산기호를 잘못 입력하셧습니다 + - * / 만 사용 가능합니다");
		}

	}

}
