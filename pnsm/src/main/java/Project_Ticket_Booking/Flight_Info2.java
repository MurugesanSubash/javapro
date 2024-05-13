package Project_Ticket_Booking;
import java.util.Scanner;
public class Flight_Info2{
    static Scanner scan = new Scanner(System.in);
    public  void Boarding_Flight(){
                    // Customer Filling Page
                    System.out.println("Please select the Starting point of your travel below \n Chennai \n Salem \n Coimbatore ");
                    System.out.println("please type the city you choosen with correct spelling."); 
                    String Starting_point= scan.next();
                    System.out.println("Please select the ending point of your travel below \n Chennai \n Salem \n Coimbatore");
                    System.out.println("please type the city you choosen with correct spelling."); 
                    String Ending_point= scan.next();
                    
                    if((Starting_point.equalsIgnoreCase("Chennai"))&&(Ending_point.equalsIgnoreCase("Salem"))){
                        System.out.println("Flight Available at \n1. 10.00 \n2.12.00");
                        System.out.println("Please enter the time you select");
                        float Timing = scan.nextFloat();
                        System.out.println("Yes, Tickets are available here.... ticket price = 1000 Do you want to book the ticked Y/N");
                        String Per = scan.next();
                        if(Per.equalsIgnoreCase("y")){
                        System.out.println("How many ticket do you want to book");
                        int number_of_Tickets = scan.nextInt();
                        for(int i=1;number_of_Tickets>=i;i++){
                        System.out.println("<<-- Enter a details of " + i+" person needs to fly");
                        System.out.println("Enter here the name of " + i+" person");
                        String Name = scan.next();
                        System.out.println("Enter the passport number of "+i+" person");
                        String ID_No = scan.next();
                        System.out.println("Enter the age of the passanger of "+ i + " person");
                        int Age = scan.nextInt();
                        Customer_info VVV = new Customer_info(Name, ID_No, Age, Timing,Starting_point,Ending_point,1000);
                        System.out.println("The Customer Details you enter is ");
                        Flight_Booking BBB = new Flight_Booking(VVV);
                        
                        }
                        }
                    }

                    if((Starting_point.equalsIgnoreCase("Chennai"))&&(Ending_point.equalsIgnoreCase("Coimbatore"))){
                        System.out.println("Flight Available at \n1. 10.00 \n2.12.00");
                        System.out.println("Please enter the time you select");
                        float Timing = scan.nextFloat();
                        System.out.println("Yes, Tickets are available here.... Do you want to book the ticked Y/N");
                        String Per = scan.next();
                        if(Per.equalsIgnoreCase("y")){
                        System.out.println("How many ticket do you want to book");
                        int number_of_Tickets = scan.nextInt();
                        for(int i=1;number_of_Tickets>=i;i++){
                        System.out.println("<<-- Enter a details of " + i+" person needs to fly");
                        System.out.println("Enter here the name of " + i+" person");
                        String Name = scan.next();
                        System.out.println("Enter the passport number of "+i+" person");
                        String ID_No = scan.next();
                        System.out.println("Enter the age of the passanger of "+ i + " person");
                        int Age = scan.nextInt();
                        Customer_info VVV = new Customer_info(Name, ID_No, Age, Timing,Starting_point,Ending_point,1500);
                        System.out.println("The Customer Details you enter is ");
                        Flight_Booking BBB = new Flight_Booking(VVV);
                        }
                        }
                    }
                    
                    if((Starting_point.equalsIgnoreCase("Salem"))&&(Ending_point.equalsIgnoreCase("Chennai"))){
                        System.out.println("Flight Available at \n1. 10.00 \n2.12.00");
                        System.out.println("Please enter the time you select");
                        float Timing = scan.nextFloat();
                        System.out.println("Yes, Tickets are available here.... Do you want to book the ticked Y/N");
                        String Per = scan.next();
                        if(Per.equalsIgnoreCase("y")){
                        System.out.println("How many ticket do you want to book");
                        int number_of_Tickets = scan.nextInt();
                        for(int i=1;number_of_Tickets>=i;i++){
                        System.out.println("<<-- Enter a details of " + i+" person needs to fly");
                        System.out.println("Enter here the name of " + i+" person");
                        String Name = scan.next();
                        System.out.println("Enter the passport number of "+i+" person");
                        String ID_No = scan.next();
                        System.out.println("Enter the age of the passanger of "+ i + " person");
                        int Age = scan.nextInt();
                        Customer_info VVV = new Customer_info(Name, ID_No, Age, Timing,Starting_point,Ending_point,2500);
                        System.out.println("The Customer Details you enter is ");
                        Flight_Booking BBB = new Flight_Booking(VVV);
                        }
                        }
                    }

                    if((Starting_point.equalsIgnoreCase("Salem"))&&(Ending_point.equalsIgnoreCase("Coimbatore"))){
                        System.out.println("Flight Available at \n1. 10.00 \n2.12.00");
                        System.out.println("Please enter the time you select");
                        float Timing = scan.nextFloat();
                        System.out.println("Yes, Tickets are available here.... Do you want to book the ticked Y/N");
                        String Per = scan.next();
                        if(Per.equalsIgnoreCase("y")){
                        System.out.println("How many ticket do you want to book");
                        int number_of_Tickets = scan.nextInt();
                        for(int i=1;number_of_Tickets>=i;i++){
                        System.out.println("<<-- Enter a details of " + i+" person needs to fly");
                        System.out.println("Enter here the name of " + i+" person");
                        String Name = scan.next();
                        System.out.println("Enter the passport number of "+i+" person");
                        String ID_No = scan.next();
                        System.out.println("Enter the age of the passanger of "+ i + " person");
                        int Age = scan.nextInt();
                        Customer_info VVV = new Customer_info(Name, ID_No, Age, Timing,Starting_point,Ending_point,3000);
                        System.out.println("The Customer Details you enter is ");
                        Flight_Booking BBB = new Flight_Booking(VVV);
                        }
                        }
                    }

                    if((Starting_point.equalsIgnoreCase("Coimbatore"))&&(Ending_point.equalsIgnoreCase("Chennai"))){
                        System.out.println("Flight Available at \n1. 10.00 \n2.12.00");
                        System.out.println("Please enter the time you select");
                        float Timing = scan.nextFloat();
                        System.out.println("Yes, Tickets are available here.... Do you want to book the ticked Y/N");
                        String Per = scan.next();
                        if(Per.equalsIgnoreCase("y")){
                        System.out.println("How many ticket do you want to book");
                        int number_of_Tickets = scan.nextInt();
                        for(int i=1;number_of_Tickets>=i;i++){
                        System.out.println("<<-- Enter a details of " + i+" person needs to fly");
                        System.out.println("Enter here the name of " + i+" person");
                        String Name = scan.next();
                        System.out.println("Enter the passport number of "+i+" person");
                        String ID_No = scan.next();
                        System.out.println("Enter the age of the passanger of "+ i + " person");
                        int Age = scan.nextInt();
                        Customer_info VVV = new Customer_info(Name, ID_No, Age, Timing,Starting_point,Ending_point,3500);
                        System.out.println("The Customer Details you enter is ");
                        Flight_Booking BBB = new Flight_Booking(VVV);
                        }
                        }
                    }

                    if((Starting_point.equalsIgnoreCase("Coimbatore"))&&(Ending_point.equalsIgnoreCase("Salem"))){
                        System.out.println("Flight Available at \n1. 10.00 \n2.12.00");
                        System.out.println("Please enter the time you select");
                        float Timing = scan.nextFloat();
                        System.out.println("Yes, Tickets are available here.... Do you want to book the ticked Y/N");
                        String Per = scan.next();
                        if(Per.equalsIgnoreCase("y")){
                        System.out.println("How many ticket do you want to book");
                        int number_of_Tickets = scan.nextInt();
                        for(int i=1;number_of_Tickets>=i;i++){
                        System.out.println("<<-- Enter a details of " + i+" person needs to fly");
                        System.out.println("Enter here the name of " + i+" person");
                        String Name = scan.next();
                        System.out.println("Enter the passport number of "+i+" person");
                        String ID_No = scan.next();
                        System.out.println("Enter the age of the passanger of "+ i + " person");
                        int Age = scan.nextInt();
                        Customer_info VVV = new Customer_info(Name, ID_No, Age, Timing,Starting_point,Ending_point,4000);
                        System.out.println("The Customer Details you enter is ");
                        Flight_Booking BBB = new Flight_Booking(VVV);
                        
                        }
                        }
                    }

                    
    } 
}