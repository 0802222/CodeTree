import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
