
class Shape{
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	 public double getArea() {
		 System.out.println("Shape unknown! Cannot compute area!");
		 return 0; 
		 }
}

class Rectangle extends Shape {
	 private int length;
	 private int width;
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]" + "subclass of " + super.toString();
	}
	 
	public double getArea() {
		double result;
		result = length * width;
		return result;
		 }
}

class Triangle extends Shape {
	 private int base;
	 private int height;
	
	 public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]" + "subclass of " + super.toString();
	}
	
	 public double getArea() {
		double result;
		result = 0.5 * base * height;
		 return result;
		 }
	 
}
public class Q1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj = new Rectangle("Green", 8, 9);
		 System.out.println(obj);
		 System.out.println("Area is " + obj.getArea());

		 Shape obj1 = new Triangle("Black", 8, 9);
		 System.out.println(obj1);
		 System.out.println("Area is " + obj1.getArea());

	}

}
