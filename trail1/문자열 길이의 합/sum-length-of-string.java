import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            sum += s.length();

            if (s.charAt(0) == 'a') {
            count++;
            }
        }

        System.out.println(sum + " " + count);
        sc.close();
    }
}