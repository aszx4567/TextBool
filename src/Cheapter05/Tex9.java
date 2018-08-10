package Cheapter05;

import java.util.*;

public class Tex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  두개의 배열을 하나로 합치기
		String a[] = { "A", "E", "I"};
		String b[] = { "O", "U"};
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}

}
