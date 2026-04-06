import java.util.Scanner;
import java.lang.Integer;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int minDiff = Integer.MAX_VALUE;
        int diff = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            diff = arr[i + 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        System.out.print(minDiff);
        sc.close();
    }
}