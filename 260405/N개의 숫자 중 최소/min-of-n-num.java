import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = n;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < min) {
                min = arr[i];
                count++;
            }
        }
        System.out.print(min + " " + count);
        sc.close();
    }
}