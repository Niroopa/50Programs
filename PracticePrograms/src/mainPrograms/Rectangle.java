package mainPrograms;

public  class Rectangle extends Shape {
	
public double length,width;

public Rectangle()
{
	this(1,1);
}

public Rectangle(double length,double width)
{
	this.length=length;
	this.width=width;
}
	@Override
	public double calculateArea() {
		
		return length*width;
	}

	@Override
	public double calculatePerimeter() {
		
		return 2*(length+width);
	}

	
	
}
