import java.util.Scanner;

public class ep59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int p = 2;
        while (n > 1) {
            int k = 0;
            while (n % p == 0) {
                n = n / p;
                k = k+1;
            }
            if (k > 0)
                System.out.print(p+"^"+k+"*");
            else
                p = p+1;
        }
    }
}

