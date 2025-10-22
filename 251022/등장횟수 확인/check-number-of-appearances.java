import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <=5; i++) {
            if (i % 2 == 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
        sc.close();
    }
}