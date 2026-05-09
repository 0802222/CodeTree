import java.util.Scanner;

public class Main {
    public static int sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }

        return total / 10;
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sum(n));

        sc.close();
    }
}