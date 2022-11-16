import java.util.Scanner;

public class RailwayBerth {
    public static void main(String[] args) {
        RailwayBerth railwayBerth = new RailwayBerth();
        railwayBerth.getInput();
    }

    private void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the seat Number : ");
        int seat = scan.nextInt();
        findSeat(seat);
    }

    private void findSeat(int seat) {
        int num = seat%8;
        if(seat>0&&seat<=72){
            if(num==1||num==4)
                System.out.println("Lower Birth");
            else if(num==2||num==5)
                System.out.println("Middle Birth");
            else if(num==3||num==6)
                System.out.println("Upper Birth");
            else if(num==0)
                System.out.println("Side Upper Birth");
            else System.out.println("Side Lower Birth");
        }
    }
}
