public class Square {
	private double side;
	
	public Square(double side){
		System.out.println("Creating square with side: " + side);
		this.side = side;
	}
	
	public double area(){
		return this.side*this.side;
	}
	
	public double perimeter(){
		return this.side*4;
	}
}