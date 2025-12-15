import java.util.Scanner;

public class ep48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int k = 1;
        while (n > 0) {
            k = (n%10) * k;
            n = n/10;
        }
        System.out.println(k);
    }
}

