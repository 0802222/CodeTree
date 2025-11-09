import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        while (n > 1) {
            n /= 2;
            x++;
        }
        System.out.print(x);
        sc.close();
    }
}