package core_java;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class done {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String [] A = new String[3];

        System.out.println("enter the 3 names ");

        int i = 2;

        for(;i>=0;i--){    //2>=0;
 
            String C = scan.next();
            A[i]=C;
        }
        System.out.println(Arrays.toString(A));

        // for(String D:A){
        //     System.out.println(D);
        // }
       
    }
    
}
