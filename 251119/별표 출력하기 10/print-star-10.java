import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 증가 부분 (1 ~ n)
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= (i + 1) / 2; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= n - i / 2 + 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        // 감소 부분 (n부터 시작해서 n번째를 한번 더)
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 1) {
                for (int j = 1; j <= (i + 1) / 2; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= n - i / 2 + 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}