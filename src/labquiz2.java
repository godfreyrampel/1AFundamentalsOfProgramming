import javax.swing.JOptionPane;

public class labquiz2 {
    public static void main(String[] args){

        String msg = "Welcome to Adobo Cooking Show!";
        JOptionPane.showMessageDialog(null, msg);
        String name = JOptionPane.showInputDialog("Enter your name:");
        String kilo = JOptionPane.showInputDialog("How many kilo of pork will you cook?");
        double pork = Double.parseDouble(kilo);
        double soySauce = pork * 0.5;
        double vinegar = pork * (1.0 / 3.0);
        JOptionPane.showMessageDialog(null,
                "The ratio of soy sauce for " + pork + " kg is = " + soySauce + " cup ");
        JOptionPane.showMessageDialog(null,
                "The ratio of vinegar for " + pork + " kg is = " + vinegar + " cup ");
        }
    }
