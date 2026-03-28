import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[10];

        while (sc.hasNextInt()) {
            int x = sc.nextInt();

            if (x == 0) {
                break;
            }

            if (x >= 10 && x <= 100) {
                int d = x / 10;
                int idx = 10 - d;
                cnt[idx]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            int score = 100 - 10 * i;
            System.out.print(score + " - " + cnt[i]);

            if (i != 9) {
                System.out.println(" ");
            }
        }
    }
}