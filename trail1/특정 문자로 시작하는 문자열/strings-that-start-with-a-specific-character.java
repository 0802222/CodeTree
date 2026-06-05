import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        char alpabet = sc.next().charAt(0);
        int count = 0;
        int sumLen = 0;

        for (int i = 0; i < n; i++) {
            String s = arr[i];

            if(s.startsWith(String.valueOf(alpabet))) {
                count++;
                sumLen += s.length();
            }
        }
        double avgLen = (double) sumLen / count;
        
        System.out.printf("%d %.2f\n", count, avgLen);
        sc.close();
    }
}