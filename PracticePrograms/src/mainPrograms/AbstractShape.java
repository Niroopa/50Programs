package mainPrograms;

public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double length=5,width=7;
		Shape rectangle=new Rectangle(length,width);
		System.out.println("printing area :"+rectangle.calculateArea());
		System.out.println("printing perimeter:"+rectangle.calculatePerimeter());
		
		double side=4;
		Shape sq=new Square(side);
		System.out.println("Area of a square:"+sq.calculateArea());
		System.out.println("Perimeter of a square :"+sq.calculatePerimeter());
	}

}
