package Airlines_Ticket_Booking;

import java.util.Scanner;

public class Ticket_Booking  {

    String Cus_Name;
    String d;
    int f;

        static Scanner scan = new Scanner(System.in);
        // Customer_info Cust_save []= new Customer_info[3];
        static Ticket_Booking c [] = new Ticket_Booking[2];

    public static void main(String[] args) {
        
        System.out.println("enter the name");
        String name = scan.next();
        System.out.println("enter the age ");
        int age = scan.nextInt();
        System.out.println("enter the id ");
        String ID = scan.next();
        
        // Customer_info obj = new Customer_info(name, age, ID);
        Ticket_Booking obj1 = new Ticket_Booking(name, age, ID);
        Ticket_Booking obj2 = new Ticket_Booking(obj1);
        new_customer_list();
        // obj1.Add_Customer(obj);
        // obj1.Customer_list();

    }
    // public Customer_info Add_Customer(Customer_info Details) {
    //   for(int i=0;i<Cust_save.length;i++){
    //     if(Cust_save[i]==null){
    //         Cust_save[i]=Details;
    //         break;
    //     }
    //   }
    // return Details;
    // }
    // public void Customer_list() {
    //     for(Customer_info newss:Cust_save){

    //         System.out.println(newss);

    //     }
    // }
    Ticket_Booking(String A,int b, String c){
        d =A;f=b; g=c;}
    Ticket_Booking(Ticket_Booking V){
        c[0]=V;
    }
    public String toString(){
        return   d + f + g;
    }
    public static void new_customer_list(){
     for(Ticket_Booking h : c){System.out.println(h);}
         
    }
    
}
