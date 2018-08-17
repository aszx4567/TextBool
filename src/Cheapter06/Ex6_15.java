package Cheapter06;

public class Ex6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(5);
		System.out.println(result);
    }
	static int factorial(int n){
		int result =0;
		if(n == 1)
			result =1;
		else result = n * factorial(n-1);  //다시 매서드 factorial(자신)을 호출한다.  
	    return result;
	}             //         fact(5) = 120
    /*   5 * fact(4) fact(4) = 24
     *    4 * fact(3) fact(3) = 6
     *    3 * fact(2) fact(2) = 2
     *    2 * fact(1) 
     *  */
}
