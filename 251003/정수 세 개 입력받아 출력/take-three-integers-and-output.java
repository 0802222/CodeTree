import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
            System.out.printf("%d ", vals[i]);
        }
    }
}