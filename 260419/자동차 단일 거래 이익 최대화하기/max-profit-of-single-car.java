import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // n 년
        int n = sc.nextInt();

        // n 년간 자동차 가격
        int[] carPrice = new int[n];

        for (int i = 0; i < n; i++) {
            carPrice[i] = sc.nextInt();
        }

        int maxRevenue = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int revenue = 0;
            
                if (carPrice[i] != carPrice[n - 1]) {
                    revenue = carPrice[j] - carPrice[i];
                }

                if (maxRevenue < revenue) {
                    maxRevenue = revenue;
                }
            }
        }
        System.out.print(maxRevenue);
        sc.close();
    }
}
