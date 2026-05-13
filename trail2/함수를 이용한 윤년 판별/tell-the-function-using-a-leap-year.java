import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int y) {
        if (y % 100 == 0 && y % 400 != 0) {
            return false;
        }
        if (y % 4 == 0) {
            return true;
        } 
        return false;
    }
        
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.print(isLeapYear(y));
    }
}