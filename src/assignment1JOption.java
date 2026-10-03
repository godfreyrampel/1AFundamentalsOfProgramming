import javax.swing.JOptionPane;

public class assignment1JOption {
    public static void main(String[] args) {

        int year = Integer.parseInt
                (JOptionPane.showInputDialog("Enter year:"));
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            JOptionPane.showMessageDialog(null, "The year is a leap year.");
        } else {
            JOptionPane.showMessageDialog(null, "The year is not leap year.");
        }
    }
}