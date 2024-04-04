package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);             
        System.out.println("Enter the name ");
        String name1 = scan.next();
        int size =name1.length();

        System.out.println("The length of your input is "+size);
        char [] name = new char[size];
        int c= 0;

        for(int a = size ;size>=1 ;size--)
        {
            // System.out.println(size);
            char get = name1.charAt(c);
            name[c] = get;
            c++;
        }
        System.out.println(Arrays.toString(name));
        int size2 = name1.length();
        size2--;
        for(int i = size2;0<=i;){
        System.out.println(name[i]);
        i--;
        }
        System.out.println(name.length);
    }
}