import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int min(int a, int b, int c) {
        int minValue = Math.min(Math.min(a, b), c);
        return minValue;
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(min(a, b, c));
        sc.close();
    }
}