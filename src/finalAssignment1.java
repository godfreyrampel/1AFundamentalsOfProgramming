import java.io.*;
public class finalAssignment1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int highest = 0, lowest = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = Integer.parseInt(br.readLine());
                if (i == 1) {
                    highest = num;
                    lowest = num;
                }
                if (num > highest) highest = num;
                if (num < lowest) lowest = num;
            }

            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }
    }

