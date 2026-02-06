import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int val;
                if (j % 2 == 1) {
                    val = i;
                } else {
                    val = n - i + 1;
                }
                System.out.print(val);
            }
            System.out.println();
        }
        sc.close();
    }
}