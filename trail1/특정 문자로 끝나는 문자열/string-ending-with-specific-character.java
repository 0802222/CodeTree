import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        char alpabet = sc.next().charAt(0);
        boolean found = false;

        for (int i = 0; i < n; i++) {
            String str = arr[i];

            if(str.endsWith(String.valueOf(alpabet))) {
                System.out.println(str);
                found = true;
            } 
        }

        if (!found){
            System.out.println("None");
        }
        
        sc.close();
    }
}