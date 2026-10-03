import java.io.*;

public class assignment4BR {
    public static void main(String[] args) {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter height in cm: ");
            double height = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Enter age: ");
            int age = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter citizenship code (C/N): ");
            String citizenship = bufferedReader.readLine();
            System.out.print("Enter recommendee code (R/N): ");
            String recommendee = bufferedReader.readLine();

            if (recommendee.equals("R")) {
                System.out.println("Applicant is accepted.");
            } else if (height >= 200 && age >= 21 && age <= 25
                    && citizenship.equals("C")) {
                System.out.println("Applicant is accepted.");
            } else {
                System.out.println("Applicant is rejected.");
            }

        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}

