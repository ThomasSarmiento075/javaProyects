public class Circle {
    private double pi = 3.14;
    private double radius;
    private double diameter;
    
    public Circle(double diameter){
        System.out.println("Creating circle with diameter: " + diameter);
        this.radius = diameter/2;
        this.diameter = diameter;
    }
    
    public double circunference(){
        return 2*this.pi*this.radius;
    }
    
    
}