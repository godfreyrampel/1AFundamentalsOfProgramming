import java.io.*;

public class assignment2BR {
    public static void main(String[] args) {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter hourly pay rate: ");

        try {
            double rate = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(bufferedReader.readLine());
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

            System.out.println("\nGross Pay: " + grossPay);
            System.out.println("Withholding Tax: Php " + withholdingTax);
            System.out.println("Net Pay: Php " + netPay);

        } catch (IOException  e) {
            System.out.println("Error reading input.");

          }
        }
      }