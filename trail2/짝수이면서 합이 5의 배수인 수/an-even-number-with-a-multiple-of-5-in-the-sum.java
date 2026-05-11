import java.util.Scanner;

public class Main {
    
    public static boolean isValidNumber(int n) {
        int sum = (n / 10) + (n % 10);

        return (n % 2 == 0) && (sum % 5 == 0);
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(isValidNumber(n) ? "Yes" : "No");
        
        sc.close();
    }
}