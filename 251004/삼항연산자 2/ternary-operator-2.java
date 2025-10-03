import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String result = (a == 1) ? "t" : "f";

        System.out.println(result);

        sc.close();
    }
}