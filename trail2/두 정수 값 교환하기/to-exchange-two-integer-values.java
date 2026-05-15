import java.util.Scanner;

public class Main {
    public static void change(int n, int m) {
        int temp = n;
        n = m;
        m = temp;
        System.out.println(n + " " + m);
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        change(n, m);
        sc.close();
    }
}