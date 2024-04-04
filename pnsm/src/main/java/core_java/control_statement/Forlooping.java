package core_java.control_statement;

import java.util.Scanner;

public class Forlooping {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the studentcount");
        int Studentcount = scan.nextInt();

        for(int Students = 5 ; Students>=Studentcount ; Studentcount--){           //10<=5
        System.out.println("Studentcount is "+Studentcount);
        System.out.println("Kindly enter your mark  here...........");
        int StudentMark = scan.nextInt();
            if(StudentMark >= 90){
                System.out.println("Please continue study");
            }

            else if (StudentMark >=80){
                System.out.println("Please go to hospital");
            }
            else if (StudentMark>=60){
                System.out.println("your mark nothing but waste");
            }
            else{
                System.out.println("please go to home and sleep");
            }
       }
   }
}
    

