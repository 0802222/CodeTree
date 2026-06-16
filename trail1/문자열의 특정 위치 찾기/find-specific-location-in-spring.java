import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int idx = str.indexOf(sc.next().charAt(0));
        
        if (idx != -1) {
            System.out.print(idx);

        } else {
            System.out.print("No");
        }
        sc.close();
    }
}