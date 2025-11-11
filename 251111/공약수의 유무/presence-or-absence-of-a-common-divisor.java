import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int minVal = Math.min(a, b);
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                satisfied = true;
            }
        }

        System.out.print(satisfied ? 1 : 0);
        sc.close();
    }
}