import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        
        char[] charArr = text.toCharArray();
        charArr[1] = 'a';
        charArr[charArr.length - 2] = 'a'; 

        System.out.println(charArr);
    }
}