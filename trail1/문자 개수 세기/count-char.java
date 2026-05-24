import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String alphabet = sc.next();

        char target = alphabet.charAt(0);

        System.out.print(findAlphabet(str, target));
        
        sc.close();
    }

    public static int findAlphabet(String str, char target) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}