import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid = 0;

        if((a >= b && a <= c) || (a <= b && a >= c)) mid = a;
        else if ((b >= a && b <= c) || (b <= a && b >= c)) mid = b;
        else mid = c;

        System.out.println(mid);

        sc.close();
    }
}