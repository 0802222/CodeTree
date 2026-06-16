import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int countEe = 0;
        int countEb = 0;

        for (int i = 0; i < str.length() -1; i++) {
            String two = str.substring(i, i + 2);
        
            if (two.equals("ee")) {
                countEe++;
            }
            if (two.equals("eb")) {
                countEb++;
            }
        }

        System.out.print(countEe + " "+ countEb);
        sc.close();
    }
}