import java.util.Scanner;


public class RotateMatrix {
    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.getMatrix();
    }

    private void getMatrix() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matrix size : ");
        int limit = scan.nextInt();
        int[][] matrix = new int[limit][limit];
        for (int row = 0; row < limit; row++) {
            for (int column = 0; column < limit; column++) {
                matrix[row][column] = scan.nextInt();
            }
        }
        swapMatrix(matrix, limit);
    }


    private void swapMatrix(int[][] matrix, int limit) {
        for (int i = 0; i < limit; i++) {
            for (int j = i; j < limit; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        display(matrix, limit);
        System.out.println();
        inverseMatrix(matrix, 5);
    }

    private void inverseMatrix(int[][] matrix, int limit) {
        for (int j = 0; j < (limit / 2); j++)
            for (int i = 0; i < limit; i++) {
                int tem = matrix[j][i];
                matrix[j][i] = matrix[(limit - j) - 1][i];
                matrix[(limit - j) - 1][i] = tem;
            }
    }

    private void display(int[][] matrix, int limit) {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }
}


