import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};

        char word = sc.next().charAt(0);
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (word == arr[i]) {
                idx = i;
                break;
            } 
        }

        if (idx == -1) {
                System.out.print("None");
        } else {
                System.out.print(idx);
        }
        sc.close();
    }
}