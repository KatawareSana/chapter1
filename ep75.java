public class ep75 {
    public static void main(String[] args) {
        int n = 1;
        for(int x=1; x<=7; x++){
            for(int y=1; y<=7; y++) {
                n = x * y;
                if (n%8 == 0)
                    System.out.println((n/8) * 10);
                else
                    System.out.println((n/8) * 10 + n%8);
            }
            System.out.print("\n");
        }
    }
}

