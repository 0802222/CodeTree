import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = sc.nextInt();

        int c2 = (int) c;
        char n2 = (char) n;

        System.out.print(c2 + " " + n2);
        sc.close();
    }
}