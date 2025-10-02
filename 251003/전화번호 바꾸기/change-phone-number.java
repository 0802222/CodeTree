import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String phoneNumber = sc.next();
        String pnArr[] = phoneNumber.split("-");

        String mobilePrefix = pnArr[0];
        int num1 = Integer.parseInt(pnArr[1]);
        int num2 = Integer.parseInt(pnArr[2]);

        System.out.printf("%s-%d-%d", mobilePrefix, num2, num1);

        sc.close();
    }
}