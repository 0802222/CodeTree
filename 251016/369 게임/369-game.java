import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            String numStr = Integer.toString(i);

            if (i % 3 == 0) {
                System.out.print(0 + " ");
            } else if (numStr.contains("3") || numStr.contains("6") || numStr.contains("9")){
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}