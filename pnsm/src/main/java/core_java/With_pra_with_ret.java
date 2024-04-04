package core_java;

import java.util.Scanner;

public class With_pra_with_ret {


    public String task1 (int age, float height)
    {

      
      String name = "Subash";

      System.out.println("my age is :"+age);

      System.out.println( "my height is:"+height);

      return name;
    }

    public void task2 (int door_number,float flat_size, double Mobilenumber , char initial)
    {
    
       
    //    System.out.println("Enter your door no");
    //    door_number = scan1.nextInt();
    //    System.out.println("Enter your flat size ");
    //    flat_size = scan1.nextFloat();
    //    System.out.println("Enter your number ");
    //    Mobilenumber = scan1.nextDouble();
    //    System.out.println("enter your initial");
    //    initial=scan1.next().charAt(0);

    System.out.println("                  ");
    System.out.println("                  ");

    System.out.println("-----------Check your details below-------------");

    System.out.println("                  ");
    System.out.println("                  ");

       System.out.println(door_number + "\n" + flat_size  + "\n" + Mobilenumber  +  "\n" + initial);

       System.out.println("                  ");
       System.out.println("                  ");

    }

    public static void main (String args[])
    {
      
        With_pra_with_ret Obtask1 = new With_pra_with_ret();

        With_pra_with_ret Obtask2 = new With_pra_with_ret();

        String name = Obtask1.task1(23, 168.5f);

        System.out.println("My name is :"+name);

        Scanner scan = new Scanner(System.in);
        System.out.println("doorno");
        int doorno=scan.nextInt();
        System.out.println("flat size");
        float flat_size=scan.nextFloat();
        System.out.println("Mobile number");
        double Mobilenumber = scan.nextDouble();
        System.out.println("Initial");
        char Initial = scan.next().charAt(0);

        Obtask2.task2(doorno,flat_size,Mobilenumber,Initial);
        
        

    }
    
}
