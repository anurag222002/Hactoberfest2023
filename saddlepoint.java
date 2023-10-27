import java.util.Scanner;

public class saddlepoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input the matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int saddlePointCol = 0;
            boolean isSaddlePoint = true;

            // Find the minimum value in the current row
            int minInRow = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    saddlePointCol = j;
                }
            }

            for (int k = 0; k < rows; k++) {
                if (matrix[k][saddlePointCol] > minInRow) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle point found at matrix[" + i + "][" + saddlePointCol + "]: " + minInRow);
            }
        }

        scanner.close();
    }
}
