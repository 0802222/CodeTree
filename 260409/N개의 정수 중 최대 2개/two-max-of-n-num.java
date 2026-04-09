import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length -1; i++) {
		    for (int j = 0; j < arr.length -1 -i; j++) {
				if (arr[j] < arr[j + 1]) {
				// 내림차순 : 앞이 더 작으면 swqp
						int tmp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tmp;
				}
		    }
        }

        System.out.print(arr[0] + " " + arr[1]);
        
        sc.close();
    }
}