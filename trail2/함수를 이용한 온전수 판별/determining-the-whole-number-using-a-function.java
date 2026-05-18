import java.util.Scanner;

public class Main {
    public static boolean isPerperctNumber(int x) {
        if (x % 2 == 0) return false;
        if (x % 10 == 5) return false;
        if (x % 3 == 0 && x % 9 != 0) return false;
        
        return true;
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;

        for (int i = A; i <= B; i++) {
            if (isPerperctNumber(i)) {
                count++;
            }
        }
        
        System.out.print(count);
        sc.close();
    }
}