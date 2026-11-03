import javax.swing.JOptionPane;
public class finalsJOp1 {
    public static void main(String[] args) {
        int highest = 0, lowest = 0;

        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + i + ":"));
            if (i == 1) {
                highest = num;
                lowest = num;
            }
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        JOptionPane.showMessageDialog(null, "Highest: " + highest + "\nLowest: " + lowest);
    }
}

