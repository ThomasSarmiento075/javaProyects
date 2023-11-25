public class Rectangle {
	private double base;
	private double height;
	
	public Rectangle(double base, double height){
		System.out.println("Creating square with base and heihgt: " + base + ", " + height);
		this.base = base;
		this.height = height;
	}
	
	public double area(){
		return this.base*this.height;
	}
	
	public double perimeter(){
		return ((2*this.base) + (2*this.height));
	}
}