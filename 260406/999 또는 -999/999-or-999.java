import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[4];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int x = sc.nextInt();

            if (x == -999 || x == 999) {
                break;
            }

            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }
        }

        System.out.print(max + " " + min);
        sc.close();
    }
}