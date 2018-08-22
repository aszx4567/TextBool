package Cheapter07;
//Ex7_7

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D  p3  =  new  Point3D(1,2,3);
		p3.getLocations();
    }
}// end main

class Points {
	int  x,  y;
	
	Points(){
	}
	
	Points(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void getLocations(){
		System.out.println(x+" , "+y);
	}
	
	String getLocation(){
		return "x :" +x+", y :"+y;
	}
}// end class Point

class Point3D extends Points{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void getLocations(){
		System.out.println(x+" , "+y+" , "+z);
	}
	
	String getLocation(){
		return "x :" +x+", y :"+y+", z :"+z;
	}
}//end class Point3D





