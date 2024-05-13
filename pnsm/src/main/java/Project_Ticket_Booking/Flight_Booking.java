package Project_Ticket_Booking;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Flight_Booking extends Flight_Info implements Methods_Project  {


    static Scanner scan =  new Scanner(System.in);
    static Customer_info Cus_Total_inf [] = new Customer_info[2];
    
    // collection 
    @SuppressWarnings("rawtypes")
    static Vector VL = new Vector<>();

    // Adding info using collection
    @SuppressWarnings("unchecked")
    public Flight_Booking(Customer_info vVV) {
        VL.add(vVV);
        System.out.println(VL);
    }
    
    Flight_Booking(){
        System.out.println("<<<-----Welcome to our flight ticket booking platform----->>>");
        System.out.println("* Do you want to book a ticket in our site * \n<<-- Press yes to enter \n<<-- Press no to exit");
    }

    public static void main(String[] args) throws IOException {
        
        Flight_Booking obj = new Flight_Booking();
        Flight_Info2 obj_FI2 = new Flight_Info2();
        
        String Cus_in = scan.next();  
        if(Cus_in.equalsIgnoreCase("yes")){
            
            for(;;){
            System.out.println(" Press 1 for booking \n press 2 for update the customer data \n press 3 for View Customer list \n Press 4 for payments ");
            int Say = scan.nextInt();
            switch (Say) {
            case 1:
                obj_FI2.Boarding_Flight();
                // System.out.println("No of customer added " + VL.size());34n
                
                break;
                case 2:
                updateVL();
                break;
                case 3:
                listVL();
                break;
                case 4:
                payments();
                break;
                case 5:
                File location = new File("D:\\javapro\\pnsm\\file.txt");
                location.createNewFile();
                System.out.println(location.getName() + " has successfully created ");
                FileOutputStream FOS = new FileOutputStream(location);
                ObjectOutputStream OOS = new ObjectOutputStream(FOS);
                OOS.writeObject(VL);
                FOS.close();
                OOS.close();
                break;
                }
            } }
    }
    // public static void createfile() throws IOException{
        // File location = new File("D:\\javapro\\pnsm\\file.txt");
        // location.createNewFile();
        // System.out.println(location.getName() + " has successfully created ");
        // FileOutputStream FOS = new FileOutputStream(location);
        // String dd =  "SubuNivi";
        // FOS.write(dd.getBytes());
        // FileInputStream FIS =  new FileInputStream(location);
        // int Filesize = FIS.available();
        // byte[ ] data = new byte[Filesize];
        // FIS.read(data);
        // String BytetoString = new String(data);
        // System.out.println(BytetoString);
        // FOS.close();
        // FIS.close();
  
    //     }
    // Payment method using Vector
    public static void payments(){
        
        System.out.println("* Do you ready to pay yes or NO *");
        String Cus_Wish_pay = scan.next();
        if(Cus_Wish_pay.equalsIgnoreCase("yes")){
            listVL();
            System.out.println("Enter the customer name his/her here you need to update");
            String n = scan.next();
            for(int i=0;i<VL.size();i++){
                if(((Customer_info) VL.get(i)).getName().equalsIgnoreCase(n))
            {
                System.out.println("<<<-- Please Select your payment method \n 1.UPI 2.Net Banking");
                int Pay_method = scan.nextInt();
            if(Pay_method==1){
                        System.out.println("This isC our UPI ID linked Number 9486411877");
                        int Send = scan.nextInt();
                        System.out.println("After Payment Wait for ticket conformation");
                        if(Send==((Customer_info)VL.get(1)).getMoney()){
                            ((Customer_info)VL.get(1)).setStatus("Payment Successfull");
                            System.out.println("* Your ticket has Successfully Booked *");
                        }
                        else {System.out.println("Payment amount not matched / recived ");}
                        return;
            }
            else if(Pay_method==2){
                        System.out.println("Bank Account number : 1247170000101492 \nIFSC code : KVBL0001247");
                        int Send = scan.nextInt();
                        System.out.println("After Payment Wait for ticket conformation");
                        if(Send==((Customer_info)VL.get(1)).getMoney()){
                            ((Customer_info)VL.get(1)).setStatus("Payment Successfull");
                            System.out.println("* Your ticket has Successfully Booked *");
                        }
                        else {System.out.println("Payment amount not matched / recived ");}
                        return;
            }
            }
        }
        }
        listVL();
    }
    // Veiw list 
    public static void listVL(){
        Iterator it =VL.iterator();
        for(;it.hasNext();){
            System.out.println(it.next());
        }
    }
    // updating using collection
    public static void updateVL(){
        listVL();
        System.out.println("Enter the customer name his/her here you need to update");
        String n = scan.next();
        for(int i=0;i<VL.size();i++)
        { if(((Customer_info) VL.get(i)).getName().equalsIgnoreCase(n))
            {
                System.out.println("Which data do you need to change \n 1.Name \n 2.Age \n 3.ID number \n 4.Flight timing \n 5.Location");
                int select = scan.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Enter the new name");
                        String name=scan.next();
                        ((Customer_info) VL.get(i)).setName(name);
                        break;
                    case 2:
                        System.out.println("Enter the new Age");
                        int age=scan.nextInt();
                        ((Customer_info) VL.get(i)).setAge(age);
                        break;
                    case 3:
                        System.out.println("Enter the new ID number");
                        String ID=scan.next();
                        ((Customer_info) VL.get(i)).setID_No(ID);
                        break;
                    case 4:
                        System.out.println("Enter the new Flight timing");
                        float time=scan.nextFloat();
                        ((Customer_info) VL.get(i)).setTime(time);
                        break;
                    case 5:
                        System.out.println("Enter the new starting point name");
                        String locat_start=scan.next();
                        ((Customer_info) VL.get(i)).setStarting(locat_start);
                        System.out.println("Enter the new ending point name");
                        String locat_ending=scan.next();
                        ((Customer_info) VL.get(i)).setEnding(locat_ending);
                        break;
                    default:
                        break;
                }
            }
        }
        listVL();
    } 


    // Adding new customer;
    public Customer_info Add_new_customer(Customer_info Details) {
        for(int i = 0; i<Cus_Total_inf.length;i++){
            if(Cus_Total_inf[i]==null){
                Cus_Total_inf[i]=Details;
                System.out.println("Customer details added successfully ");
                break;
            }}
        return Details;}  
    // Listing the customer details;
    public static void View_Customer_list(){
        for(Customer_info get:Cus_Total_inf){
            System.out.println(get);   
        }} 
    // Deleting Customer details;
    public static void Removing_Customer(){
        Flight_Booking.View_Customer_list();
        System.out.println("Which customer do you need to remove form the list");
        System.out.println("Please select the option \n 1.Name \n 2.ID number \n 3.Age");
        int choose =scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter the name");
                String name = scan.next();
                for(int i=0;i<Cus_Total_inf.length;i++){
                if(name.equalsIgnoreCase(Cus_Total_inf[i].getName())){
                    Cus_Total_inf[i]=null;
                    break;
                }
                }
                System.out.println("<<--- Updated list --->>");
                Flight_Booking.View_Customer_list();
                break;
            case 2:
            System.out.println("Enter the ID number");
            String ID_No = scan.next();
            for(int i=0;i<Cus_Total_inf.length;i++){
            if(Cus_Total_inf[i].getID_No()!=null){
            if(ID_No.equalsIgnoreCase(Cus_Total_inf[i].getID_No())){
                Cus_Total_inf[i]=null;
                break;
            }
            }
            System.out.println("Name your ID number not in the list....!");
            }
            System.out.println("<<--- Updated list --->>");
            Flight_Booking.View_Customer_list();
                break;
            case 3:
            System.out.println("Enter the Age");
            int Age = scan.nextInt();
            for(int i=0;i<Cus_Total_inf.length;i++){
            if(Age == Cus_Total_inf[i].getAge()){
                Cus_Total_inf[i]=null; 
                break;
            }
            }
            System.out.println("<<--- Updated list --->>");
            Flight_Booking.View_Customer_list();
                break;    
            default:
                break;
        }
    }
    public static void Update_Customer_List(){
        Flight_Booking.View_Customer_list();
        System.out.println("Which customer do you need to UPDATE ON the list");
        System.out.println("Please select the option \n 1.Name \n 2.ID number \n 3.Age");
        int choose =scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter the name you need to change");
                String name = scan.next();
                for(int i=0;i<Cus_Total_inf.length;i++){
                if(name.equalsIgnoreCase(Cus_Total_inf[i].getName())){
                System.out.println("Enter the new name");
                String New_name=scan.next();
                Cus_Total_inf[i].setName(New_name);
                break;
                }
                }
                System.out.println("Updated list");
                Flight_Booking.View_Customer_list();
                break;
            case 2:
                System.out.println("Enter the name you need to change");
                String ID_NO = scan.next();
                for(int i=0;i<Cus_Total_inf.length;i++){
                if(ID_NO.equalsIgnoreCase(Cus_Total_inf[i].getID_No())){
                System.out.println("Enter the new ID number");
                String New_name=scan.next();
                Cus_Total_inf[i].setID_No(New_name);
                break;
                }
                }
                System.out.println("Updated list");
                Flight_Booking.View_Customer_list();
                break;
            case 3:
            System.out.println("Enter the age you need to change");
                int Age = scan.nextInt();
                for(int i=0;i<Cus_Total_inf.length;i++){
                if(Age==Cus_Total_inf[i].getAge()){
                System.out.println("Enter the new Age");
                int New_Age = scan.nextInt();
                Cus_Total_inf[i].setAge(New_Age);
                break;
                }
                }
                System.out.println("Updated list");
                Flight_Booking.View_Customer_list();
                break;    
            default:
                break;
        }
    }

    
}
