import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        int engHighScore = Math.max(aEng, bEng);

        if (aMath == bMath) {
            if (aEng > bEng) {
                System.out.print("A");    
            } else {
                System.out.print("B");
            }
        } else if (aMath > bMath) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }

        sc.close();
    }
}