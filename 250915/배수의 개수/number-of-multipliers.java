import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int count3 = 0;
        int count5 = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 3 == 0) {
                count3++;
            }
            if(nums[i] % 5 == 0) {
                count5++;
            }
        }
        System.out.println(count3 + " " + count5);
    }
}