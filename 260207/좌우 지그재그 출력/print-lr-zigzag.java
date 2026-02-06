import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // 홀수
                for (int j = 1; j <= n; j++) {
                    System.out.print(val + " ");
                    val++;
                }
            } else { // 짝수
                int start = val + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(start - j + " ");
                    val++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}