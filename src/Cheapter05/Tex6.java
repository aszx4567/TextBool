package Cheapter05;

import java.util.*;

public class Tex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.add(0, "0th element");
		objArray.add(1, "1st element");
		objArray.add(2, "2nd element");
		System.out.println("Array before removing an element"+objArray);
		objArray.remove(1);
		objArray.remove("0th element");
		System.out.println("Array after removing an element"+objArray);

	}



}
