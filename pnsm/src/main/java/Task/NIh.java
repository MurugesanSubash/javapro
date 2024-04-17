package Task;

import java.util.Scanner;

public class NIh {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a [] ={0,1,2,3,4,5,6,7,8,9};
         for(int d:a){
            System.out.println(d);
         }
         int c = scan.nextInt()+1;
         System.out.println(a[c]);
    }
    
}
