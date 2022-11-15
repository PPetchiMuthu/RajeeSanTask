import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int num = scan.nextInt();
        printSpiralMatrix(num);
    }

    private void printSpiralMatrix(int num) {
        int[][] matrix = new int[num][num];
        int count = 1;
        int rowStartingIndex = 0;
        int columnStartingIndex = 0;
        int rowEndingIndex = num-1;
        int columnEndingIndex = num-1;
        while (rowStartingIndex <= rowEndingIndex || columnStartingIndex <= columnEndingIndex) {
            for (int column = columnStartingIndex; column <= columnEndingIndex; column++) {
                matrix[rowStartingIndex][column] = count++;
            }
            rowStartingIndex++;
            for(int row = rowStartingIndex;row<=rowEndingIndex;row++){
                matrix[row][columnEndingIndex] = count++;
            }
            columnEndingIndex--;
            for(int column = columnEndingIndex;column>=columnStartingIndex;column-- ){
                matrix[rowEndingIndex][column] = count++;
            }
            rowEndingIndex--;
            for(int row = rowEndingIndex;row>=rowStartingIndex;row--){
                matrix[row][columnStartingIndex] = count++;
            }
            columnStartingIndex++;
        }
        for(int row=0;row<num;row++) {
            for (int column = 0; column < num; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
