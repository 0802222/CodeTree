import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.

        int count = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime(i) && isSumEven(i)) {
            count++;
            }
        }
        
        System.out.print(count);
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSumEven(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num %10;
            num /= 10;
        }
        return sum % 2 == 0;
    }
}