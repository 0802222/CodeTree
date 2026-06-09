import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String encoded = runLengthEncoding(str);
        System.out.println(encoded.length());
        System.out.println(encoded);

        sc.close();
    }

    public static String runLengthEncoding(String str) {
        int n = str.length();

        char prev = str.charAt(0);
        int count = 1;

        String result = "";

        for (int i = 1; i < n; i++) {
            char cur = str.charAt(i);
            
            if (cur == prev) {
                count++;
            } else {
                result += prev + String.valueOf(count);

                prev = cur;
                count = 1;
            }
        }

        result += prev + String.valueOf(count);

        return result;
    }
}