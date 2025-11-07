import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String str = sc.next();

            System.out.println(a * b);

            if (str.equals("C")){
                break;
            }
        }
        sc.close();
    }
}