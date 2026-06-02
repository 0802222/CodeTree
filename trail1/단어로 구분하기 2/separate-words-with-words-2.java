import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = 10;
        for (int i = 1; i <= n; i++) {
            String s = sc.next();
            if (i % 2 != 0) {
                System.out.println(s);
            }
        }
        sc.close();
    }
}