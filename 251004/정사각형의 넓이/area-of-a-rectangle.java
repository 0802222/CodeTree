import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rectangleArea =  n * n;

        System.out.println(rectangleArea);

        if (n < 5) {
            System.out.println("tiny");
        } 

        sc.close();
    }
}