import java.util.Scanner;

public class Main {

    public static boolean has369(int x) {
        while(x > 0) {
            int digit = x % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }
            x /= 10;
        }
        return false;
    }
    
    public static int countNumber(int a, int b) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (has369(i) || i % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = countNumber(a, b);
        System.out.print(result);

        sc.close();
    }
}