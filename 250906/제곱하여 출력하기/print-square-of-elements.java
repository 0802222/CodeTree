import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        // n개의 원소의 제곱 값 출력
        for(int i = 0; i < n; i++) {
            System.out.print((arr[i] * arr[i]) + " ");
        }
    }
}