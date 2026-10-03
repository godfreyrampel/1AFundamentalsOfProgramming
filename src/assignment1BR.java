import java.io.*;

public class assignment1BR {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter year: ");
            int year = Integer.parseInt(bufferedReader.readLine());
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }

        } catch (IOException e) {
            System.out.println(("Error reading input"));
        }
    }
}