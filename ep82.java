import java.util.Scanner;

public class ep82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int s =0;//sum
        int p =1;
        while(n>0){
            s = s + (n%2)*p;
            p = p * 10;
            n= n / 2;
        }
        System.out.println(s);
    }
}

