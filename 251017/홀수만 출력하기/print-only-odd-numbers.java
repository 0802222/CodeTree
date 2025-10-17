import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1 && nums[i] % 3 == 0) {
                System.out.println(nums[i]);
            }
        }
        sc.close();
    }
}