import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break;
            }

            if (arr[i] % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.print(count + " " + sum);
        sc.close();
    }
}