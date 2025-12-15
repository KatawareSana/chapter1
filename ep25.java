import java.util.Scanner;

    public class ep25 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number: ");
            int n = input.nextInt();
            int k = 1;
            for (int x = 1; x <= n; x++) {
                k = k * x;

            }
            System.out.println(k);
        }
    }

