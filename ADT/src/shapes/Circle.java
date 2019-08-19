package shapes;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
	

}
