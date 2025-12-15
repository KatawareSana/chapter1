public class ep40 {
    public static void main(String[] args) {
        int s = 0;
        int a = 1;
        while (s<50) {
            int c = 0;
            for (int y=1; y<=a; y++) {
                if (a % y == 0)
                    c++;
            }
            if (c==2)
                s = s+1;
            a++;
        }
        System.out.print(a-1);
    }
}

