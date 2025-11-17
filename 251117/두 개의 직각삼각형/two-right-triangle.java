import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        sc.close();
    }
}