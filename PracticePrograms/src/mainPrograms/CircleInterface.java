package mainPrograms;

public class CircleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double radius=5;
  Circle ci=new Circle(radius);
  System.out.println("printing diameter:"+ci.calculateDiameter());
  System.out.println("printing area:"+ci.calculateArea());
  System.out.println("printing perimeter:"+ci.calculatePerimeter());
  
	}

}
