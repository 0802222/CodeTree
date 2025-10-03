import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int min = a - b;
        double div = (double) sum / min;
        
        System.out.printf("%.2f", div);
        sc.close();
    }
}