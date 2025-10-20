import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int classroomCleanCount = 0;
        int hallwayCleanCount = 0;
        int restroomCleanCount = 0;
        for (int i = 1; i <= n; i++) {
            
            if (i % 12 == 0) {
                restroomCleanCount++;
                
            } else if (i % 3 == 0) {
                hallwayCleanCount++;
                
            } else if (i % 2 == 0) {
                classroomCleanCount++;
            }
        }

        System.out.println(classroomCleanCount + " " + hallwayCleanCount + " " + restroomCleanCount);

        sc.close();
    }
}