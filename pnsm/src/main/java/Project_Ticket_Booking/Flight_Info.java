package Project_Ticket_Booking;

import java.util.Scanner;

public class Flight_Info  {
 
    static Scanner scan = new Scanner(System.in);
    static int Flight_Prize=1000;
    static int Flight_prize_Indico=3000;
    String Location;
    Float Time;
    int Price;
 
public void Flight_Choosing(){
        System.out.println("Choose your flight \n 1.Air India \n 2.Kingfisher");
            int Flight_card=scan.nextInt();
            switch (Flight_card) {
                case 1:
                    System.out.println("<<<-Thank you for choosing Air India flying service.");
                    System.out.println("Please select the Starting point of your travel below \n Chennai \n Salem \n Coimbatore ");
                    System.out.println("please type the city you choosen with correct spelling."); 
                    String Air_Starting_point= scan.next();
                    System.out.println("Please select the ending point of your travel below \n Chennai \n Salem \n Coimbatore");
                    System.out.println("please type the city you choosen with correct spelling."); 
                    String Air_Ending_point= scan.next();
                    if((Air_Starting_point.equalsIgnoreCase("Chennai"))&&(Air_Ending_point.equalsIgnoreCase("Salem")))
                      {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    if((Air_Starting_point.equalsIgnoreCase("Chennai"))&& (Air_Ending_point.equalsIgnoreCase("Coimbatore")))
                        { System.out.println("Flight available on :\n1.11.00 \n2.15.00 ");
                        System.out.println("Which timing do you want to select?");
                        int Flight_Timing = scan.nextInt();
                       switch (Flight_Timing) {
                       case 1:
                           String Flight_name="Air India";
                           Air_India_CtoC_11(Flight_name);
                           System.out.println("Tickets available now");
                           System.out.println("Your ticket price is "+Flight_Prize);
                           break;
                       case 2:
                           String Flight_name_1="Air India";
                           Air_India_CtoC_15(Flight_name_1);
                           System.out.println("Tickets available now");
                           System.out.println("Your ticket price is "+Flight_Prize);
                           break;
                       default:
                            System.out.println("Sorry choose correct timing");
                           break;
                     }
                    }
                    if((Air_Starting_point.equalsIgnoreCase("Salem"))&& (Air_Ending_point.equalsIgnoreCase("Chennai")))
                    {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                    System.out.println("Which timing do you want to select?");
                    int Flight_Timing = scan.nextInt();
                   switch (Flight_Timing) {
                   case 1:
                       String Flight_name="Air India";
                       Air_India_name(Flight_name);
                       System.out.println("Tickets available now");
                       System.out.println("Your ticket price is "+Flight_Prize);
                       break;
                   case 2:
                       String Flight_name_1="Air India";
                       Air_India_name_12(Flight_name_1);
                       System.out.println("Tickets available now");
                       System.out.println("Your ticket price is "+Flight_Prize);
                       break;
                   default:
                   System.out.println("Sorry choose correct timing");
                       break;
                 }
                 }
                    if((Air_Starting_point.equalsIgnoreCase("Salem"))&& (Air_Ending_point.equalsIgnoreCase("Coimbatore")))
                    {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                    System.out.println("Which timing do you want to select?");
                    int Flight_Timing = scan.nextInt();
                   switch (Flight_Timing) {
                   case 1:
                       String Flight_name="Air India";
                       Air_India_name(Flight_name);
                       System.out.println("Tickets available now");
                       System.out.println("Your ticket price is "+Flight_Prize);
                       break;
                   case 2:
                       String Flight_name_1="Air India";
                       Air_India_name_12(Flight_name_1);
                       System.out.println("Tickets available now");
                       System.out.println("Your ticket price is "+Flight_Prize);
                       break;
                   default:
                   System.out.println("Sorry choose correct timing");
                       break;
                 }
                }
                    if((Air_Starting_point.equalsIgnoreCase("Coimbatore"))&& (Air_Ending_point.equalsIgnoreCase("Salem")))
                    {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    if((Air_Starting_point.equalsIgnoreCase("Coimbatore"))&& (Air_Ending_point.equalsIgnoreCase("Chennai")))
                    {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    break;
                case 2:
                System.out.println("<<<-Thank you for choosing Kingfisher flying service.");
                    System.out.println("Please select the Starting point of your travel below \n Chennai \n Salem \n Coimbatore ");
                    System.out.println("please type the city you choosen with correct spelling."); 
                    String King_Starting_point= scan.next();
                    System.out.println("Please select the Ending point of your travel below \n Chennai \n Salem \n Coimbatore");
                    System.out.println("please type the city you choosen with correct spelling."); 
                    String King_Ending_point= scan.next();
                    if((King_Starting_point.equalsIgnoreCase("Chennai"))&& (King_Ending_point.equalsIgnoreCase("Salem")))
                        // System.out.println("You need to pay  "+Flight_Prize);
                        {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    if((King_Starting_point.equalsIgnoreCase("Chennai"))&& (King_Ending_point.equalsIgnoreCase("Coimbatore")))
                        // System.out.println("You need to pay  "+Flight_Prize);
                        {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     } 
                    if((King_Starting_point.equalsIgnoreCase("Salem"))&& (King_Ending_point.equalsIgnoreCase("Chennai")))
                        // System.out.println("You need to pay  "+Flight_Prize);
                        {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    if((King_Starting_point.equalsIgnoreCase("Salem"))&& (King_Ending_point.equalsIgnoreCase("Coimbatore")))
                        // System.out.println("You need to pay  "+Flight_Prize);
                        {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     } 
                    if((King_Starting_point.equalsIgnoreCase("Coimbatore"))&& (King_Ending_point.equalsIgnoreCase("Salem")))
                        // System.out.println("You need to pay  "+Flight_Prize);
                        {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    if((King_Starting_point.equalsIgnoreCase("Coimbatore"))&& (King_Ending_point.equalsIgnoreCase("Chennai")))
                        // System.out.println("You need to pay  "+Flight_Prize);
                        {  System.out.println("Flight available on :\n1.10.00 \n2.12.30");
                         System.out.println("Which timing do you want to select?");
                         int Flight_Timing = scan.nextInt();
                        switch (Flight_Timing) {
                        case 1:
                            String Flight_name="Air India";
                            Air_India_name(Flight_name);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        case 2:
                            String Flight_name_1="Air India";
                            Air_India_name_12(Flight_name_1);
                            System.out.println("Tickets available now");
                            System.out.println("Your ticket price is "+Flight_Prize);
                            break;
                        default:
                        System.out.println("Sorry choose correct timing");
                            break;
                      }
                     }
                    break;
                default:
                System.out.println("Sorry Somthing went worng !");
                    break;
            }  
    }
    public String Air_India_name(String Flight_name){
        String A = Flight_name;
        return "Air India, Flight Time - 10.00 ,Traveling - Chennai to Salem ,Flight Ticket price - 1000 ";
    }
    public String Air_India_name_12(String Flight_name){
        String A = Flight_name;
        return "Air India, Flight Time - 12.30 ,Traveling - Chennai to Salem ,Flight Ticket price - 1000 ";
    }
    public String Air_India_CtoC_11(String Flight_name){
        String A = Flight_name;
        return "Air India, Flight Time - 11.00 ,Traveling - Chennai to Coimbatore ,Flight Ticket price - 1000 ";
    }
    public String Air_India_CtoC_15(String Flight_name){
        String A = Flight_name;
        return "Air India, Flight Time - 15.00 ,Traveling - Chennai to Coimbatore ,Flight Ticket price - 1000 ";
    }
}
               












































// case 3:
                // System.out.println("<<<-Thank you for choosing Indico flying service.");
                //     System.out.println("Please select the Starting point of your travel below \n Chennai \n Salem \n Coimbatore \n Madurai \n Trichy");
                //     System.out.println("please type the city you choosen with correct spelling."); 
                //     String Indico_Starting_point= scan.next();
                //     System.out.println("Please select the Ending point of your travel below \n Chennai \n Salem \n Coimbatore \n Madurai \n Trichy");
                //     System.out.println("please type the city you choosen with correct spelling."); 
                //     String Indico_Ending_point= scan.next();
                //     if((Indico_Starting_point.equalsIgnoreCase("Chennai"))&& (Indico_Ending_point.equalsIgnoreCase("Salem")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Chennai"))&& (Indico_Ending_point.equalsIgnoreCase("Coimbatore")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico); 
                //     if((Indico_Starting_point.equalsIgnoreCase("Chennai"))&& (Indico_Ending_point.equalsIgnoreCase("Madurai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);   
                //     if((Indico_Starting_point.equalsIgnoreCase("Chennai"))&& (Indico_Ending_point.equalsIgnoreCase("Trichy")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Salem"))&& (Indico_Ending_point.equalsIgnoreCase("Chennai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Salem"))&& (Indico_Ending_point.equalsIgnoreCase("Coimbatore")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico); 
                //     if((Indico_Starting_point.equalsIgnoreCase("Salem"))&& (Indico_Ending_point.equalsIgnoreCase("Madurai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);   
                //     if((Indico_Starting_point.equalsIgnoreCase("Salem"))&& (Indico_Ending_point.equalsIgnoreCase("Trichy")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Coimbatore"))&& (Indico_Ending_point.equalsIgnoreCase("Salem")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Coimbatore"))&& (Indico_Ending_point.equalsIgnoreCase("Chennai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico); 
                //     if((Indico_Starting_point.equalsIgnoreCase("Coimbatore"))&& (Indico_Ending_point.equalsIgnoreCase("Madurai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);   
                //     if((Indico_Starting_point.equalsIgnoreCase("Coimbatore"))&& (Indico_Ending_point.equalsIgnoreCase("Trichy")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Madurai"))&& (Indico_Ending_point.equalsIgnoreCase("Salem")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Madurai"))&& (Indico_Ending_point.equalsIgnoreCase("Chennai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico); 
                //     if((Indico_Starting_point.equalsIgnoreCase("Madurai"))&& (Indico_Ending_point.equalsIgnoreCase("Coimbatore")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);   
                //     if((Indico_Starting_point.equalsIgnoreCase("Madurai"))&& (Indico_Ending_point.equalsIgnoreCase("Trichy")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Trichy"))&& (Indico_Ending_point.equalsIgnoreCase("Salem")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     if((Indico_Starting_point.equalsIgnoreCase("Trichy"))&& (Indico_Ending_point.equalsIgnoreCase("Chennai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico); 
                //     if((Indico_Starting_point.equalsIgnoreCase("Trichy"))&& (Indico_Ending_point.equalsIgnoreCase("Madurai")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);   
                //     if((Indico_Starting_point.equalsIgnoreCase("Trichy"))&& (Indico_Ending_point.equalsIgnoreCase("Coimbatore")))
                //         System.out.println("You need to pay  "+Flight_prize_Indico);
                //     break;