public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int a = 5;
        int b = 6;
        int c = 7;
        int temp;

        temp = b;
        b = a;
        a = c;
        c = temp;

        System.out.println(a); // 7
        System.out.println(b); // 5
        System.out.println(c); // 6
    }
}