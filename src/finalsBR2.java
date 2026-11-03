import java.io.*;
public class finalsBR2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Press Enter to display the even numbers: ");
        br.readLine();

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}
