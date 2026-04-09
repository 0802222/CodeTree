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
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > firstMax) {
                secondMax = firstMax;
                firstMax = x;
            } else if (x > secondMax) {
                secondMax = x;
            }
        }

        System.out.print(firstMax + " " + secondMax);
        sc.close();
    }
}