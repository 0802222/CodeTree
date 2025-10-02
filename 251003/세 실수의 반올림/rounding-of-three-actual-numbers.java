import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = 3;

        double[] vals = new double[n];

        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextDouble();
            System.out.printf("%.3f\n", vals[i]);
        }
    }
}