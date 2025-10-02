import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String date = sc.next();
        String[] dateArr = date.split("\\.");

        int yyyy = Integer.parseInt(dateArr[0]);
        int mm = Integer.parseInt(dateArr[1]);
        int dd = Integer.parseInt(dateArr[2]);

        System.out.printf("%d-%d-%d", mm, dd, yyyy);

        sc.close();
    }
}