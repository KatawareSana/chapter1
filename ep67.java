import java.util.Scanner;

public class ep67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0;
        for(int x = 1; x <= 10; x++){
            System.out.print("enter your number " + x + ": ");//just wanted to know which number im putting
            int n = input.nextInt();
            int p = 0;
            p = n;
            int s = 0;
            while(n>0){
                s = n%10 + s*10;
                n = n/10;
            }
            if(s==p)
                k = k+1;
        }
        System.out.println(k);

    }
}

