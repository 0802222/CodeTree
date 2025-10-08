import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid = 0;

        if(a > b) {
            if (a > c) mid = c;
            else if (a < c) mid = a;
        } else if (b > a) {
            if (b > c) mid = c;
            else if (b < c) mid = b;
        } else if (c > a) {
            if (c > b) mid = b;
            else if (c < b) mid = c;
        }

        System.out.println(mid);

        sc.close();
    }
}