import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        double ft = 30.48;
        double inputFt = sc.nextDouble();

        System.out.printf("%.1f", ft * inputFt);
    }
}