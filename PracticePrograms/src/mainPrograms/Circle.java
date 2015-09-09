package mainPrograms;

public class Circle extends Shape implements ShapeConstants {

public double radius;


public Circle(double radius)
{
	this.radius=radius;
}
	
	@Override
	public double calculateDiameter() {
		// TODO Auto-generated method stub
		return 2*radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
 double radius=5;
 Circle 
	}*/

	
	}


