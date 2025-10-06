import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        if (score1 >= 90 && score2 >= 95) {
            System.out.print(100_000);
        } else if (score1 >= 90 && score2 >= 90) {
            System.out.print(50_000);
        } else {
            System.out.print(0);
        }

        sc.close();
    }
}