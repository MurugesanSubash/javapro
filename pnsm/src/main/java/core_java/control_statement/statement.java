package core_java.control_statement;

import java.util.Scanner;

public class statement 
{
    static Scanner scan = new Scanner(System.in);

    public static void condition (int mark, String group)
    {
      if(mark >=90){
        System.out.println("your can apply for doctor");

        System.out.println("Enter the location where your want to join");
        String Location = scan.next();
    
        if (Location.equalsIgnoreCase("salem")){
        System.out.println("you can apply in the government college of salem");
        }
        else{
            System.out.println("choose another location");
        }
      }
      else if (mark >=80)
      {
        System.out.println("you can apply for engineering");
      }
      else if (mark>=70)
      {
        System.out.println("you can apply for art and science");
      }
        else 
      {
           System.out.println("you should close your studys");
      }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter your group name");
        String group = scan.nextLine();
        System.out.println("Enter your total mark");
        int mark = scan.nextInt();
        condition(mark, group);
    }
}