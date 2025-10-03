import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int b = (10000 * w) / (h * h);

        if (b <= 25) {
            System.out.printf("%d\n", b);
        } else {
            System.out.printf("%d\n", b);
            System.out.println("Obesity");
        }

        sc.close();
    }
}