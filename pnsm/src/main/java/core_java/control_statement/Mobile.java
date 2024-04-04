package core_java.control_statement;

import java.util.Scanner;

public class Mobile {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=== MObile Stock Analysis ===");
        System.out.println("         ");
        int Mobilecount = 25;
        double Singlemobilevalue = 10000;
        double Totalvalues = Mobilecount*Singlemobilevalue;
        System.out.println("Total mobiles available in store "+Mobilecount);
        System.out.println("         ");
        System.out.println("Total value of mobiles "+Totalvalues);
        System.out.println("         ");
        System.out.println("Single mobile prize is "+Singlemobilevalue);
        System.out.println("         ");
        System.out.println( "Do you want to BUY enter YES / Go to main page enter NO");
        String Interest = scan.next();
        System.out.println("         ");
        
        if(Interest.equalsIgnoreCase("Yes")){

           for(Mobilecount = 25; (Mobilecount>=1) ; )
           {
                System.out.println("How many mobiles do you want");
                System.out.println("         ");
                int No_of_Mobile_need = scan.nextInt();
                    if(No_of_Mobile_need<=Mobilecount)
                    {
                            Mobilecount -= No_of_Mobile_need; 
                            // System.out.println("Available mobiles "+Mobilecount);
                            double Valuesofmobiles = No_of_Mobile_need*Singlemobilevalue;
                            System.out.println("you need to pay " + Valuesofmobiles);
                            System.out.println("         ");
                            double Payment_by_customer = scan.nextDouble();

                        if(Payment_by_customer == Valuesofmobiles)
                        {
                            System.out.println("Your order has successfully registered Wait for update");
                            System.out.println("         ");
                            System.out.println("Remaining mobiles "+Mobilecount);
                            System.out.println("         ");
                        }
                        else {
                            System.out.println("Payment FAILED / Amount not match with us.");
                        }
                    }
                    else{
                        System.out.println("         ");
                        System.out.println("Sorry this quantity is not available");
                        System.out.println("Please select the available quantity");
                        System.out.println("         ");
                        }
           }
        }
        else{ System.out.println("Thank YOU for vist us...,");}
    }
}
