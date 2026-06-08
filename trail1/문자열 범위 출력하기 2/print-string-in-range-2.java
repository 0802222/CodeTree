import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int len = str.length();

        if (n > len) {
            n = len;
        }

        String tail = str.substring(len - n);

        for (int i = tail.length() - 1; i >= 0; i--) {
            System.out.print(tail.charAt(i));
        }

        sc.close();
    }
}