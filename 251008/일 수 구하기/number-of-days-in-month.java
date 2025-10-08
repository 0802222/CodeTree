import java.util.Scanner;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int days = Month.of(n).length(false);

        System.out.println(days);

        sc.close();
    }
}