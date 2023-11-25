public class Triangle {
	private double base;
	private double height;
	double hypotenuse;
	
	public Triangle(double base, double height){
		System.out.println("Creating triangle with base and height: " + base + ", " + height);
		this.hypotenuse = Math.sqrt((base*base)+(height*height));
		this.base = base;
		this. height = height; 
	}
	
	public double area(){
		return (this.base*this.height)/2;
	}
	
	public double perimeter(){
		return this.base + this.height + this.hypotenuse;
	}
}