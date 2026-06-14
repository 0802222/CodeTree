import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String allString = "";

        for (int i = 0; i < n; i++){
            String str = sc.next();
            allString += str;
        }

        int idx = 0;
        int len = allString.length();

        while (idx < len) {
            int end = Math.min(idx + 5, len);
            System.out.println(allString.substring(idx, end));

            idx += 5;
        }
        sc.close();
    }
}