import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String A) {
        // palidrome 검사
        int left = 0;
        int right = A.length() - 1;

        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        if (isPalindrome(A)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}