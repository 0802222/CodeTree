import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 1) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }

        int max = Math.max(oddSum, evenSum);
        int min = Math.min(oddSum, evenSum);

        System.out.print(max - min);
        sc.close();
    }
}