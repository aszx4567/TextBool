package Cheapter05;

import java.util.ArrayList;

public class Tex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>objArray = new ArrayList<String>();
		ArrayList <String>objArray2 = new ArrayList<String>();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray.add(2, "notcommon2");
		System.out.println("Array elements of array1"+objArray);
		System.out.println("Array elements of array2"+objArray2);
		objArray2.retainAll(objArray);
		System.out.println("Array1 after retaining common elements of array2 & array1 "+objArray2);
		
		System.out.println("Array1 contains String common2??"+objArray2.contains("common1"));
		
	
	}

}
