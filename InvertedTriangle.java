package InvertedTriangle;
import java.util.Scanner;


public class InvertedTriangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numberOfRows=0;
        System.out.println("How many rows do you wish for your pyramid?");
        numberOfRows=input.nextInt();
        for(int i=1; i<=numberOfRows;i++){
            for(int k=numberOfRows; k>=i; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}