import java.util.Scanner;

public class assignment4Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter height in cm: ");
            double height = scanner.nextDouble();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter citizenship code (C/N): ");
            String citizenship = scanner.next();
            System.out.print("Enter recommendee code (R/N): ");
            String recommendee = scanner.next();

            if (recommendee.equals("R")) {
                System.out.println("Applicant is accepted.");
            } else if (height >= 200 && age >= 21 && age <= 25
                    && citizenship.equals("C")) {
                System.out.println("Applicant is accepted.");
            } else {
                System.out.println("Applicant is rejected.");
            }
            scanner.close();
        }
    }
