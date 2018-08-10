package Cheapter05;

import java.util.*;

public class Tex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 reverse [뒤집기]시키기
		ArrayList arrList = new ArrayList();
		arrList.add("안");
		arrList.add("녕");
		arrList.add("하");
		arrList.add("세");
		arrList.add("요");
		System.out.println("before reverse : "+arrList);
		Collections.reverse(arrList);
		System.out.println("after reverse : "+arrList);

	}

}
