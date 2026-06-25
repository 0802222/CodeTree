import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        String left = str.substring(0, 1);
        String middle = str.substring(2, n - 2);
        String right = str.substring(n - 1, n);

        String result = left + middle + right;

        System.out.print(result);
        sc.close();
    }
}

