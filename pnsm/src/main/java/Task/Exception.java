package Task;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int Number []={0,11,32,53,74,95,56,37,84,96,140};
       
        System.out.println(Arrays.toString(Number));

        try{
            System.out.println("Enter the values that you want to print");
            int Im = scan.nextInt();
            for(int i=0;i<Number.length;i++){
                System.out.println( "This is the value you choose " +Number[Im]);
                break;
            }
        }
        catch(InputMismatchException Misma){
            System.out.println("<<<--- PLEASE USE NUMBERS* AS INPUT TO CHOOSE");
            System.out.println("Enter the values that you want to print");
            int on = scan.nextShort();
            System.out.println(on+"th position"+"value is "+Number[on]);
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("<<<--- PLEASE USE NUMBERS* AS INPUT TO CHOOSE");
            System.out.println("Enter the values that you want to print");
            int o = scan.nextInt();
            System.out.println(o+"th position"+"value is "+Number[o]);
        }
        finally{
            System.out.println("///// Thank you /////");
        }
    }
}
       