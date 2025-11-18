import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 위
        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //별
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래
        for (int i = n - 2; i >= 0; i--) {
            // 공백
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //별
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}