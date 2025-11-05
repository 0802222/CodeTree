import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n;
        int i;
        
        for (i = 1; i <= n; i++) {
            div /= i;

            if (div <= 1) {
                break;
            }
        }
        System.out.print(i);
        sc.close();
    }
}