package core_java;

import java.util.Scanner;

public class InnerWorkplace 
{

        static String name = "SubashNivi";
+

        public void task ( String A, String B) 
        {
                //A-Manoj
                //B-Subash
                char A1= A.charAt(0);
                char B1=B.charAt(0) ; 
                System.out.println(A1);
                System.out.println(B1);
        }
        public static void main (String args[])
        {
            InnerWorkplace obj = new  InnerWorkplace();
            Scanner scan = new Scanner (System.in);
            System.out.println("enter the 2 names");
            String Name1 = scan.next();
            String Name2 = scan.next();
            obj.task ( Name1, Name2);
            
            System.out.println("enter any value between 0-9 as index for below");
            System.out.println(name);
            int index = scan.nextInt();
            char charvalue = name.charAt(index);
            System.out.println(charvalue);
            
        }
}
