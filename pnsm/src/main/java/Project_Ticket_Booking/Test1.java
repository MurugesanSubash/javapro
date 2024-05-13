package Project_Ticket_Booking;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    static Scanner sc=new Scanner(System.in);

    Test1(String A,Long B, String C,String D,String E,String F){
        othername = A;
        otherno = B;
        otheraddress =C;
        otheradhar = D;
        pickup=E;
        drop=F;
    }
    
        static String othername;
        static long otherno;
        static String otheraddress;
        static String otheradhar;
        static String pickup;
        static String drop;
        
        public String toString() {
            return "Customer_info [Name = " + othername + ", Mobile number = " + otherno + ", Address = " + otheraddress + "Aadhar number = "+ otheradhar+ "]";
        }
        
    public static String getOthername() {
            return othername;
        }
        public static void setOthername(String othername) {
            Test1.othername = othername;
        }
        public static long getOtherno() {
            return otherno;
        }
        public static void setOtherno(long otherno) {
            Test1.otherno = otherno;
        }
        public static String getOtheraddress() {
            return otheraddress;
        }
        public static void setOtheraddress(String otheraddress) {
            Test1.otheraddress = otheraddress;
        }
        public static String getOtheradhar() {
            return otheradhar;
        }
        public static void setOtheradhar(String otheradhar) {
            Test1.otheradhar = otheradhar;
        }
        public static String getPickup() {
            return pickup;
        }
        public static void setPickup(String pickup) {
            Test1.pickup = pickup;
        }
        public static String getDrop() {
            return drop;
        }
        public static void setDrop(String drop) {
            Test1.drop = drop;
        }
    Test1(Test1 Copy)
    {
       for(int i=0;i<store.length;i++){
       if(store[i]==null)
       {
           store[i]=Copy;
           System.out.println("Add Successfully");
           break;
       }
    }
    }
    static Test1 [] store=new Test1[3];
     Test1()
     {
        System.out.println("Welcome to Uber Online cab Booking App");
     }
    public static void list(){
        for(Test1 A:store){
            System.out.println(A);
        }
    }
    public static void main(String[] args) {
        Test1 obj=new Test1();
        System.out.println("Please Install The Uber App\nPlease Enter Install");
            System.out.println("You have an Already Account Means please Enter Login..!");
            String enter=sc.next();
            if ((enter.equalsIgnoreCase("Install"))) {
                System.out.println("You Installed Successfully..!");
            }
            //System.out.println("You have an Account Already Means please Login Here..!");
            else if (enter.equalsIgnoreCase("Login")) {
             System.out.println("You Logined Successfully");
                //String enters=sc.next();
            } else {
                System.out.println("Please Enter Choose Install / Login..!");
            }
            System.out.println("Add Your Trip Details,Hop in,and Go...");
            System.out.println("Our Service is Available on Salem, Covai, Chennai...!");
            System.out.println("Where do You want to go Please Enter Your District..!");
            String location=sc.next();

            System.out.println("Please Enter your Near By Current Location in salem..! \n 1.Salem New Busstand\n 2.Salem Old Busstand \n 3.Salem Airport\n 4.Yercaud\n 5.Valapady \n Dont Use space..Please use Underscore");
            String pick=sc.next();
            System.out.println("Enter Your Destination....!");
            String drop=sc.next();

            if(location.equalsIgnoreCase("Salem"))
            {
                 
                 if(pick.equalsIgnoreCase("Salem_New_BusStand"))
                 {
                    System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 10 mins..!");                
                 }
                 else if(pick.equalsIgnoreCase("Salem_Old_BusStand"))
                 {
                    System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 15 mins..!");
                 }
                 else if(pick.equalsIgnoreCase("Salem_Airport"))
                 {
                    System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 14 mins..!");
                 }
                 else if(pick.equalsIgnoreCase("Yercad"))
                 {
                    System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 18 mins..!");
                 }
                 else if(pick.equalsIgnoreCase("Valapady"))
                 {
                    System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 13 mins..!");
                 }      
                 else {
                    System.out.println("Sorry In this place our Cab Services is not Available..!");
                 }
            }
            else if(location.equalsIgnoreCase("Covai"))
            {
                System.out.println("You Choose Covai A Uber Cab Available on Covai New Busstand");
                if(pick.equalsIgnoreCase("Covai_New_BusStand"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 10 mins..!");                
                }
                else if(pick.equalsIgnoreCase("Covai_Old_BusStand"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 15 mins..!");
                }
                else if(pick.equalsIgnoreCase("Covai_Airport"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 14 mins..!");
                }
                else if(pick.equalsIgnoreCase("Brook_field"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 18 mins..!");
                }
                else if(pick.equalsIgnoreCase("Covai_Junction"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is :"+drop+"\n Please Wait Your Cab Can Arrives At with in 13 mins..!");
                } 
                else {
                    System.out.println("Sorry In this place our Cab Services is not Available..!");
                 }     
            }
            else if(location.equalsIgnoreCase("Chennai"))
            {
                System.out.println("You Choose Chennai A Uber Cab Available on Covai New Busstand");
                if(pick.equalsIgnoreCase("Chennai_New_BusStand"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 10 mins..!");                
                }
                else if(pick.equalsIgnoreCase("Chennai Old BusStand"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 15 mins..!");
                }
                else if(pick.equalsIgnoreCase("Chennai_Airport"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 14 mins..!");
                }
                else if(pick.equalsIgnoreCase("Phineas_Mall"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 18 mins..!");
                }
                else if(pick.equalsIgnoreCase("Covai Junction"))
                {
                   System.out.println("Your Current Location is : "+pick+"Your Destination is : "+drop+"\n Please Wait Your Cab Can Arrives At with in 13 mins..!");
                } 
                else {
                    System.out.println("Sorry In this place our Cab Services is not Available..!");
                 }
            }
            else 
            {
                System.out.println("Sorry In this place our Cab Services is not Available..!");
            }
        System.out.println("Enter your Username Here...!");  
        String username=sc.next();
        if((username.equalsIgnoreCase("Nivi"))||(username.equalsIgnoreCase("Subash"))||(username.equalsIgnoreCase("ManojKumar"))||(username.equalsIgnoreCase("Praveen")))
        {
            System.out.println("Enter your password here..!");
            String password=sc.next();
            if((password.equalsIgnoreCase("Nivi123"))||(password.equalsIgnoreCase("Subash123"))||(password.equalsIgnoreCase("Manojkumar"))||(password.equalsIgnoreCase("Praveen")))
             System.out.println("You Logined Successfully..!");
             System.out.println("Choose Your Way..!\n 1. One Trip 2.Round Trip ");
             int c=sc.nextInt();
             
             switch (c) {
                case 1:
                    System.out.println("You Choose One way ");
                    System.out.println("Enter Full name");
                    String name=sc.next();
                    System.out.println("Enter Your Mobile Number");
                    long no=sc.nextLong();
                    System.out.println("Enter your address");
                    String address=sc.next();
                    System.out.println("Enter your Adhar no");
                    String adhar_no=sc.next();
                    Test1 par =new Test1(name, no,address, adhar_no,pick,drop);
                    Test1 cop = new Test1(par);
                    break;
                case 2:
                    System.out.println("You Choose Round Trip ");
                    System.out.println("Enter Full name");
                    String name1=sc.next();
                    System.out.println("Enter Your Mobile Number");
                    long no1=sc.nextLong();
                    System.out.println("Enter your address");
                    String address1=sc.next();
                    System.out.println("Enter your address");
                    String adhar_nos=sc.next();
                    break;
             }
             System.out.println("Choose Your Travel Facility \n Choose any one \n Mini \n Sedan \n Innova \n T.Travellar 12 Seat");
             String km=sc.next();
             if (km.equalsIgnoreCase("Mini"))
            {
              System.out.println("You choose Mini $13/Km ");   
            }
            else if (km.equalsIgnoreCase("Sedan"))
            {
                System.out.println("You choose Sedan $14 / Km ");       
            }
            else if (km.equalsIgnoreCase("Innova")) 
            {
                System.out.println("You choose Innova $19 / Km ");  
            }
            else if (km.equalsIgnoreCase("T.Traveller"))
            {
                System.out.println("You choose T.Traveller $23 / Km ");      
            }
            else
            {
                System.out.println("Sorry..!");
            }
        }
         else
         {
             System.out.println("Enter correct password");
         }
       update();
       delete();
        System.out.println("Features"); 
        System.out.println("-> Real-Time Availability");
        System.out.println("  Pick up at your location (door step)\n Driver will arrive at your marked location via whatsapp or App");
        System.out.println("$ No Advance Payment\n Providing mutliple payment options like credit/debit cards,\n Net Banking,wallets and cash-on-delivery available for customers");
}

public static void update(){
    System.out.println("For which customer details you need to update");
    list();
    System.out.println("Which value you want to change \n 1.Name \n 2.Pickup_Location \n 3.Drop_Location \n please type your choosen one ");
    String in = sc.next();
    if(in.equalsIgnoreCase("Name")){
        System.out.println("Enter the name you want to update");
        String Name_in=sc.next();
        for(int i =0;i<store.length;i++){ 
            if(Name_in.equalsIgnoreCase(store[i].getOthername())){
             System.out.println("Enter the new name");
             String New_name=sc.next();
             store[i].setOthername(New_name);
             break;
            }
        } 
        System.out.println("New Updated Customer list"); 
        list();
    }
    if(in.equalsIgnoreCase("Pickup_Loaction")){
        System.out.println("Enter the customer name for update his pickup location");
        String Name_in=sc.next();
        for(int i =0;i<store.length;i++){ 
            if(Name_in.equalsIgnoreCase(store[i].getOthername())){
             System.out.println("Enter the new Pickup location");
             String New_Pick_lo=sc.next();
             store[i].setPickup(New_Pick_lo);
             break;
            }
        } 
        System.out.println("New Updated Customer list"); 
        list();
    }
    if(in.equalsIgnoreCase("Drop_Loaction")){
        System.out.println("Enter the customer name for update his dorp location");
        String Name_in=sc.next();
        for(int i =0;i<store.length;i++){ 
            if(Name_in.equalsIgnoreCase(store[i].getOthername())){
             System.out.println("Enter the new Pickup location");
             String New_Drop_lo=sc.next();
             store[i].setDrop(New_Drop_lo);
             break;
            }
        } 
        System.out.println("New Updated Customer list"); 
        list();
    }
}
 public static void delete(){
    System.out.println("Which customer do you need to delete enter his name");
   String Cus_name=sc.next();
   for(int i =0;i<store.length;i++){ 
    if(Cus_name.equalsIgnoreCase(store[i].getOthername())){
     store[i]=null;
     break;
    }
} 
System.out.println("New Updated Customer list"); 
list();
 }
}
