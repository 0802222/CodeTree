import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        
        arrB[0] = arrA[0];
        arrB[1] = arrA[1];

        System.out.println(arrB);
        
        sc.close();
    }
}