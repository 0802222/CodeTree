import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}