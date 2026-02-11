import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = Math.min(A, B);
        int max = Math.max(A, B);

        for (int i = 2; i <= 8; i += 2) {
            for (int j = max; j >= min; j--) {
                System.out.print(j + " * " + i + " = " + (j * i));
                if (j > min ) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}