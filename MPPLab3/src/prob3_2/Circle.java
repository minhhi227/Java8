package prob3_2;

public class Circle {

	private static final double PI = 3.14;
	private double radius = 1.0;
	private String color = "red";

	public Circle() {
		super();
	}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "radius: " + radius + ", color: " + color;
	}

}
