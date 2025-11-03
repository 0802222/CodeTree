import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int i;
        
        for (i = 1; i < 10; i++) {
            prod *= i;

            if (prod >= n) {
                break;
            }
        }
        System.out.print(i);
        sc.close();
    }
}