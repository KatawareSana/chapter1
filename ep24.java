import java.util.Scanner;

public class ep24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int k = 0;
        for (int x = 1; x <= n; x++) {
            if (k % x == 0)
                k++;
        }
        if (k==2)
            System.out.println("Yes");
        if (k!=2)
            System.out.println("No");
    }
}

