
public class Circle {
	
	private double radius;
	private String colour;
	
	public Circle() {
		radius = 1.0;
		colour = "blue";
	}
	
	public Circle(double r) {
		radius = r;
		colour = "blue";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
