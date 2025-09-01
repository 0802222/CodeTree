import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int book = 3000;
        int mask = 1000;

        if (n >= 3000) {
            System.out.println("book");
        } else if (n >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}