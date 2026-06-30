import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String order = sc.next();
        int n = A.length();

        for (int i = 0; i < order.length(); i++) {
            char cmd = order.charAt(i);

            // 왼쪽으로 밀기
            if (cmd == 'L') {
                A = A.substring(1) + A.charAt(0);
            
            // 오른쪽으로 밀기
            } else if (cmd == 'R') {
                A = A.charAt(n - 1) + A.substring(0, n - 1);
            }
        }

        System.out.print(A);
        sc.close();
    }
}