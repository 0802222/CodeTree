import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int minOver = 1000;
        int maxUnder = 1;

        for (int i = 0; i < 10; i++) {
            // 500 미만 중 가장 큰 수
            if (arr[i] < 500 && arr[i] > maxUnder) {
                maxUnder = arr[i];
            }
            // 500 초과 중 가장 작은 수
            if (arr[i] > 500 && arr[i] < minOver) {
                minOver = arr[i];
            }
        }
        System.out.print(maxUnder + " " + minOver);
        sc.close();
    }
}