public class ep41 {
    public static void main(String[] args) {
        int s = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        while (s<50) {
            c = b + a;
            System.out.println(c);
            a = b;
            b = c;
            s++;
        }
    }
}

