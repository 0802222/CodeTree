import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        boolean isPrime = true;

        // 2 부터  n-1 까지 순회
        for (int i = 2; i < n; i++) {
            // n이 1외에 약수로 나누어지면 false
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        sc.close();
        System.out.print(isPrime ? "P" : "C");
    }
}