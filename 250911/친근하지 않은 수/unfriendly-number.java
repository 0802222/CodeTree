import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 친근하지 않은 수 카운트
        int count = 0;

        for (int i = 1; i <= n; i++) {
            // 친근한 수 건너뛰기
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            count++;
        }
        System.out.println(count);

    }
}