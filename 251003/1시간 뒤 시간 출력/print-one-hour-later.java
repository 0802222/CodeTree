import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] timeArr = time.split(":");

        int h = Integer.parseInt(timeArr[0]);
        int m = Integer.parseInt(timeArr[1]);
        

        System.out.printf("%d:%d", h + 1, m);
    }
}