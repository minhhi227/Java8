package prob3_2;

public class Cylinder {

	private Circle circle;
	private double height = 1.0;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		this.circle = new Circle();
		this.circle.setRadius(radius);
	}

	public Cylinder(double radius, double height) {
		this.circle = new Circle();
		this.circle.setRadius(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}

}
