import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();
        
        StringBuilder sb = new StringBuilder(S);

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                a--;
                b--;

                char ca = sb.charAt(a);
                char cb = sb.charAt(b);
                sb.setCharAt(a, cb);
                sb.setCharAt(b, ca);

                System.out.println(sb.toString());
            } else if (type == 2) {
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);
        
                for (int idx = 0; idx < sb.length(); idx++) {
                    if(sb.charAt(idx) == x) {
                        sb.setCharAt(idx, y);
                    }
                }
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}