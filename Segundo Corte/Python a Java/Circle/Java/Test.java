public class Test {
    public static void main(String[] args) {
 
        Circle medium_pizza = new Circle(12);
        Circle teaching_table = new Circle(36);
        Circle round_room = new Circle(11460);
        
        System.out.println();
        System.out.println("The circunference of the medium pizza is: " + medium_pizza.circunference());
        System.out.println("The circunference of the teaching table is: " + teaching_table.circunference());
        System.out.println("The circunference of the round room is: " + round_room.circunference());
    }
    
}