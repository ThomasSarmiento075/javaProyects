public class Test {
	public static void main(String[] args) {

		Square paint = new Square(12);
		Square table = new Square(20);
		Square window = new Square(35);
		
		System.out.println("Area: " + paint.area() + ", Perimeter: " + paint.perimeter());
		System.out.println("Area: " + table.area() + ", Perimeter: " + table.perimeter());
		System.out.println("Area: " + window.area() + ", Perimeter: " + window.perimeter());
		}
	
}