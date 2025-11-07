import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (count < 3) {
            int n = sc.nextInt();

            if (n % 2 == 1) {
                continue;
            } else if (n % 2 == 0) {
                System.out.println(n / 2);
                count++;
            }
        }
        sc.close();
    }
}