import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        Map<Integer, Integer> cnt = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
        }

        int answer = -1;

        for (int x : arr) {
            if (cnt.get(x) == 1) {
                if (answer == -1 || x > answer) {
                    answer = x;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}