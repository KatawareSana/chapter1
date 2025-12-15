import java.util.Scanner;

public class ep81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int k = 1;
        int s = 0;
        while(n>0) {
            if(n%10!=0) {
                s = s + (n % 10) * k;
                k = k * 10;
            }
            n =  n/10;
        }
        System.out.println(s);
    }
}

