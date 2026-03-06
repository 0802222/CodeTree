import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Double[] arr = new Double[8];

        Double sum = 0.0;
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        Double avg = sum / 8;
        System.out.printf("%.1f", avg);
        sc.close();
    }
}