import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (true) {
            if (n == 1) {
                System.out.print(count);
                break;
            }
            
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else if (n % 2 == 1) {
                n *= 3;
                n += 1;
                count++;
            }
        }
        sc.close();
    }
}