import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            cnt[x]++;
        }

        int answer = -1;

        for (int x : arr) {
            if (cnt[x] == 1) {
                if (answer == -1 || x > answer) {
                    answer = x;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}