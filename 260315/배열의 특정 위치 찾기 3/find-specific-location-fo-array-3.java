import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int idx = 0;
        int zeroIdx = -1;

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            arr[idx] = x;
            if (x == 0) {
                zeroIdx = idx;
                break;  
            }
            idx++;
        }
        int sum = arr[zeroIdx-1] + arr[zeroIdx-2] + arr[zeroIdx-3];
        System.out.print(sum);
        sc.close();
    }
}