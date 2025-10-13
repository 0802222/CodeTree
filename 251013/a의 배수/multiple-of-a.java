import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();
        int a = sc.nextInt();

        while (i <= n) {
            if ((i % a == 0)) {
                System.out.println(1 + " ");
            } else {
                System.out.println(0 + " ");
            }
            i++;
        }     
        sc.close();
    }
}