package Cheapter05;

public class Compute_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op = args[1];
		int num2 = Integer.parseInt(args[2]);
		int num1 = Integer.parseInt(args[0]);
		System.out.println("����1 ��Ģ�����ȣ ����2      �̷��� �Է��� �ּ���");
		
		if(op == "+"){
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else if(op == "-"){
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}else if(op == "*"){
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}else if(op== "/"){
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}else{
			System.out.println("�����ȣ�� �߸� �Է��ϼ˽��ϴ� + - * / �� ��� �����մϴ�");
		}

	}

}
