import java.util.Scanner;

public class assignment2Scanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();

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

        scanner.close();

    }
  }
