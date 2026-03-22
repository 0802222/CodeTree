import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[11];
        int x = 0;

        for (int i = 1; i <= 10; i++) {
            // n의 배수 출력
            arr[i] = i * n;
            System.out.print(arr[i] + " ");

            if (arr[i] % 5 == 0) {
                x++;
            }

            if (x >= 2) {
                break;
            }
        }
        sc.close();
    }
}