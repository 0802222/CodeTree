import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        char next = (char)(c - 1);

        if(c == 'a') {
            next = 'z';
        }

        System.out.println(next); 

        sc.close();
    }
}