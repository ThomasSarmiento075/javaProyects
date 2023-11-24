import javax.swing.JOptionPane;

public class Add {
    public static void main(String[] args) {
        
        String value1;
        String value2;
        int result, number1, number2;

        value1 = JOptionPane.showInputDialog("Enter First number");
        value2 = JOptionPane.showInputDialog("Enter Secodn number");
        
        number1 = Integer.parseInt(value1);
        number2 = Integer.parseInt(value2);
        
        result = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "Result is " + result, "Result", JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    }     
}