package core_java.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Two_Dim {
    static Scanner scan = new Scanner(System.in);
public static void main(String[] args) { 
    String IPL [][] = new String[5][2];
    System.out.println("<< Please enter the 10 IPL team name Below....");
    for(int i = 0;i<5;i++){
        for(int a = 0;a<2;a++){
        String Values = scan.next();
        IPL[i][a]=Values;
        }
    }
    System.out.println("<<< Direct print of 2D ARRAYS......(Using For Each )*");
    // for(String [] Printing : IPL){
    //     System.out.println( Arrays.toString(Printing));
    // }
    for(String [] Newname: IPL){
        for(String Newname1:Newname){
            System.out.print(Newname1);
        } System.out.println("");
    }

    String Two [] = new String[10];
     int g=0;  
    for(int d=0;d<5;d++){
        for(int s = 0;s<2;s++){
            Two[g]=IPL[d][s];
            g++;
        }
    }
    System.out.println("After changed into single dimensional ARRAYS......*");
    System.out.println(Arrays.toString(Two));
}
}
    

