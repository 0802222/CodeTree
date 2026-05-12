import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int primeSum(int a, int b) {
        int sum = 0;

        for(int i = a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }        
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = primeSum(a, b);
        System.out.println(sum);
        
        sc.close();
    }
}