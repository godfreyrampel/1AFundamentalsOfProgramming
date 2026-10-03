import javax.swing.JOptionPane;

public class assignment2JOption {
    public static void main(String[] args){

        double rate = Double.parseDouble
                (JOptionPane.showInputDialog("Enter hourly pay rate:"));
        double hours = Double.parseDouble
                (JOptionPane.showInputDialog("Enter hours worked:"));

        double grossPay = hours * rate;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 10;
        } else if (grossPay <= 4000) {
            taxRate = 12;
        } else if (grossPay <= 10000) {
            taxRate = 15;
        } else {
            taxRate = 20;
        }

        double withholdingTax = grossPay * (taxRate / 100);
        double netPay = grossPay - withholdingTax;

        JOptionPane.showMessageDialog(null,
                "Gross Pay: " + grossPay +
                        "\nWithholding Tax: Php " + withholdingTax +
                        "\nNet Pay: Php " + netPay);

    }
}
