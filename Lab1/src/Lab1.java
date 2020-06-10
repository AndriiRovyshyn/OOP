public class Lab1 {
    public static void main(String[] args) {
        float Sum = 0;
        final int c = 0;
        final int n = 3;
        final int m = 4;
        final int a = 1;
        final int b = 1;
        if (n <= 0 || m <= 0){
            System.out.println("Wrong value of N or(and) M");
            System.exit(0);
        }else {
            for (byte i = a; i <= n; i++) {
                for (byte j = b; j <= m; j++) {
                    if (i == 0) {
                        System.out.println("Error, division by zero");
                        System.exit(0);
                    } else {
                        Sum += (float) (i - j) / (i - 0);
                    }
                }
            }
        }
        System.out.println("Result:" + Sum);
    }
}
