import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int lengthSum = a.length() + b.length();
        System.out.print(lengthSum);
        
        sc.close();
    }
}