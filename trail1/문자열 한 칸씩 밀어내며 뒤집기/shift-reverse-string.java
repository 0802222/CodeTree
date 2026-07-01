import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String cur = sc.next();
        int Q = sc.nextInt();

        // 문자열 요청
        for (int i = 0; i < Q; i++) {
            int order = sc.nextInt();
            String result = "";

            if (order == 1) {
                char first = cur.charAt(0);
                cur = cur.substring(1) + first;
            } else if (order == 2) {
                char last = cur.charAt(cur.length() - 1);
                cur = last + cur.substring(0, cur.length() - 1);
            } else if (order == 3) {
                StringBuilder sb = new StringBuilder(cur);
                cur = sb.reverse().toString();
            }

            System.out.println(cur);
        }

        sc.close();
    }
}