import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = n;

        while (i <= 100) {
            if (i >= 90) {
                System.out.print("A ");
            } else if (i >= 80) {
                System.out.print("B ");
            } else if (i >= 70) {
                System.out.print("C ");
            } else if (i >= 60) {
                System.out.print("D ");
            } else {
                System.out.print("F ");    
            }
            i++;
        }
        sc.close();
    }
}