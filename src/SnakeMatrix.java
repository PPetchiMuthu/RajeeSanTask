import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        SnakeMatrix snakeMatrix = new SnakeMatrix();
        snakeMatrix.printSnakeMatrix();
    }

    private void printSnakeMatrix() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        int spaces = (number/2)*number ;
        int count = 0;
        for(int i = 0; i<number;i++){
            for(int space=0;space<spaces;space++)
                System.out.print(" ");
            for(int j=0;j<number;j++)
                if(i%2==0)
                  System.out.print(++count +"  ");
                else
                    System.out.print(count-- +"  ");
            System.out.println();
            count += number;
            spaces -= 4;
        }

    }
}
