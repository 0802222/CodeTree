import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        sc.close();
        
        int result = 0;
        boolean isValidOp = true; 

        if (o == '+') {
            result = plus(a, c);
        } else if (o == '-') {
            result = minus(a, c);
        } else if (o == '*') {
            result = multiply(a, c);
        } else if (o == '/') {
            result = divide(a, c);
        } else {
            isValidOp = false;
        }

        if (isValidOp) {
            System.out.println(a + " " + o + " " + c + " = " + result);
        } else {
            System.out.println("False");
        }
    }
    
    public static int plus(int a, int c) {
    
        return a + c;
    }

    public static int minus(int a, int c) {

        return a - c;
    }

    public static int multiply(int a, int c) {
        
        return a * c;
    }

    public static int divide(int a, int c) {

        return a / c;
    }
}