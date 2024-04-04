package core_java;

import java.util.Scanner;

public class Workout 
{
    

   public static void main (String args[])
   {

    String name;
    char name1;
    int Age;
    long Aadhar_no;
    String Date_of_Birth;
    String Fathers_name;
    double Mobile_number;


    Scanner obj1 = new Scanner(System.in);

    System.out.println("Enter your name");
    name = obj1.next();
    System.out.println("Enter your intial");
    // Data type is char must use
    name1=obj1.next().charAt(0);
    System.out.println("Enter your Age");
    Age = obj1.nextInt();
    System.out.println("Enter your Aadhar no");
    Aadhar_no = obj1.nextLong();
    System.out.println("Enter your D.O.B");
    Date_of_Birth = obj1.next();
    System.out.println("Enter your Father name");
    Fathers_name = obj1.next();
    System.out.println("Enter your MObile Number");
    Mobile_number = obj1.nextDouble();

    System.out.println("                  ");
    System.out.println("                  ");

    System.out.println("-----------Check your details below-------------");

    System.out.println("                  ");
    System.out.println("                  ");

    
    System.out.println("Name :"+name+"."+name1);
    System.out.println("Age :"+Age);
    System.out.println("Aadhar No :"+Aadhar_no);
    System.out.println("D.O.B :"+ Date_of_Birth);
    System.out.println("Fathers name :"+ Fathers_name);
    System.out.println("D.O.B :"+ Mobile_number);

   }

   static
    {
        System.out.println("                  ");
        System.out.println("                  ");
        System.out.println("                           *******  Kindly Enter the below  *********");
        System.out.println("                  ");
        System.out.println("                  ");
    }

}
