import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        boolean isMultiple = true;

        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            if (n % 3 != 0) {
                isMultiple = false;
            }
        }

        System.out.print(isMultiple ? 1 : 0);
        sc.close();
    }
}