import java.util.Scanner;

public class Main {
    public static int gcd(int n, int m) {
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public static int lcm(int n, int m) {
        return n / gcd(n, m) * m;
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = lcm(n, m);
        System.out.println(result);

        sc.close();
    }
}