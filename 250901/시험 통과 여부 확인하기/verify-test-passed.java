import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num >= 80) {
            System.out.println("pass");
        } else {
            System.out.println((80 - num) + " more score");
        }
    }
}