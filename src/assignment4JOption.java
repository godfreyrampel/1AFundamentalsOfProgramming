import javax.swing.JOptionPane;

public class assignment4JOption {
    public static void main(String[] args) {

        double height = Double.parseDouble
                (JOptionPane.showInputDialog("Enter height in cm: "));
        int age = Integer.parseInt
                (JOptionPane.showInputDialog("Enter age: "));
        String citizenship = JOptionPane.showInputDialog("Enter citizenship code (C/N): ");
        String recommendee = JOptionPane.showInputDialog("Enter recommendee code (R/N): ");

        if (recommendee.equals("R")) {
            JOptionPane.showMessageDialog(null,"Applicant is accepted.");
        } else if (height >= 200 && age >= 21 && age <= 25
                && citizenship.equals("C")) {
            JOptionPane.showMessageDialog(null,"Applicant is accepted.");
        } else {
            JOptionPane.showMessageDialog(null,"Applicant is rejected.");
        }
    }
}
