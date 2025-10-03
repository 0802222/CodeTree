import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rectangleArea =  n * n;

        if (n < 5) {
            System.out.println(rectangleArea);
            System.out.println("tiny");
        } else {
            System.out.println(rectangleArea);
        }

        sc.close();
    }
}