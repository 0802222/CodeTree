import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i;

        for (i = 1; i <= 100; i++) {
            sum += i;
            
            if (sum >= n) {
                break;
            }
        }
        System.out.print(i);
        sc.close();
    }
}