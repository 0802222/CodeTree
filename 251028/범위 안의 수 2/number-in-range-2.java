import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n >= 0 && n <= 200) {
                sum += n;
                cnt++;
            }
        }

        if (cnt > 0) {
            double avg = (double) sum / cnt;
            System.out.printf("%d %.1f", sum, avg);
        }
        sc.close();
    }
}