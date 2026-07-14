import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int sum = 0;

        for (int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);

            if (Character.isDigit(ch)){
                int digit = ch - '0';
                sum += digit;
            }
        }

        System.out.print(sum);
        sc.close();
    }
}