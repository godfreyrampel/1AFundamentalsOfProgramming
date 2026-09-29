import javax.swing.JOptionPane;

public class labquiz3 {
    public static void main(String[] args){

        double oldSalary = Double.parseDouble(JOptionPane.showInputDialog("Old Salary: "));
        double newSalary = oldSalary * 1.1775;
        double increase = (newSalary - oldSalary) * 2;
        JOptionPane.showMessageDialog(null, "New Salary: " + newSalary);
        JOptionPane.showMessageDialog(null, "Amount of retroactive pay: " + increase);
    }
}
