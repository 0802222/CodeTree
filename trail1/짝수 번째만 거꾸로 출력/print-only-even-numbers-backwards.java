import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = reversePrintEvenString(str);
        System.out.println(result);
        
        sc.close();
    }

    public static String reversePrintEvenString(String str) {
        int n = str.length();
        String evenChars = "";
        
        for (int i = 1; i < n; i += 2) {
            evenChars += str.charAt(i);
        }

        String result = "";
        for (int i = evenChars.length() - 1; i >= 0; i--) {
            result += evenChars.charAt(i);
        }
        
        return result;
    }
}