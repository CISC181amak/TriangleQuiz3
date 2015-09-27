
public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	// Returns perimeter of the triangle as a double
	public double getPerimeter() {
		return (getSide1() + getSide2() + getSide3());
	}
	
	// Returns area of the triangle as a double
	public double getArea() { // using Heron's formula
		double s = getPerimeter() / 2;
		double A = Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
		return A;
	}
	
	// Returns string describing triangle
	public String toString() {
		return ("created on " + getDateCreated() + "\ncolor: " + getColor() +
			      "\nfilled: " + isFilled() + "\nperimeter: " + getPerimeter() +
				"\narea: " + getArea());
	}
	
	// To see what toString() outputs
	
	/* public static void main(String[] args) {
		Triangle triangle = new Triangle("white", true, 4, 13, 15);
		System.out.println(triangle.toString());
	} */
}
