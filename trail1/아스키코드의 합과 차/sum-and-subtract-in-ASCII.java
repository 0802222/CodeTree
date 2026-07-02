import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int a1 = (int) c1;
        int a2 = (int) c2;

        int sum = a1 + a2;
        int diff = Math.abs(a1 - a2);

        System.out.print(sum + " " + diff);
        sc.close();
    }
}