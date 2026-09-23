import java.util.Scanner;

public class saddle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < r; i++) {

            // Find minimum element in the row
            int min = a[i][0];
            int minCol = 0;

            for (int j = 1; j < c; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    minCol = j;
                }
            }

            // Check if it is maximum in its column
            boolean isSaddle = true;

            for (int k = 0; k < r; k++) {
                if (a[k][minCol] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point = " + min);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}
