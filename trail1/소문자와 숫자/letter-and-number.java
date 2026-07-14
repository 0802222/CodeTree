import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String lowerStr = str.toLowerCase();
        
        String result = lowerStr.replaceAll("[^a-z0-9]", "");

        System.out.print(result);
        sc.close();
    }
}