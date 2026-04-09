import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Integer[] 로 변환
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // 내림차순 정렬
        Arrays.sort(integerArr, Collections.reverseOrder());

        System.out.print(integerArr[0] + " " + integerArr[1]);
        
        sc.close();
    }
}