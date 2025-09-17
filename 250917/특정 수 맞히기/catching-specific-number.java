import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n != 25) {
            n = sc.nextInt();

            if (n == 25) {
                System.out.println("Good");
            } else if ( n <= 25) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
        }
    }
}