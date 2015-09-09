package mainPrograms;

public class Square extends Shape{
	
	public double side;
	
	public Square()
	{
		this(1);
	}

	public Square(double side)
	{
		this.side=side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
}
