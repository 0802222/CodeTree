import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int countPerfectNumber = 0;
        
        for (int n = start; n <= end; n++) {
            int sum = 0;

            // 진약수 구하기
            for (int i = 1; i < n; i++) {
                if (n > 0 && n % i == 0 && n != i) {
                sum += i;
                }
            }
            
            // 진약수의 합이 n 과 같다면 완전수
            if (sum == n) {
                countPerfectNumber++;
            }
        }
        System.out.print(countPerfectNumber);
        sc.close();
    }
}