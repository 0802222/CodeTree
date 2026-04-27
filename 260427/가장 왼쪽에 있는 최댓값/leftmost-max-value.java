import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int right = n - 1;
        boolean first = true; // for space

        while (true) {
            int maxVal = Integer.MIN_VALUE;
            int maxIdx = -1;

            for (int i = 0; i <= right; i++) {
                
                // find maxVal & maxIdx
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIdx = i;
                }
            }

            if (!first) {
                System.out.print(" ");
            }

            System.out.print(maxIdx + 1); // print position
            first = false;

            if (maxIdx == 0) {
                break;
            }
            right = maxIdx - 1;
        }
        sc.close();
    }
}