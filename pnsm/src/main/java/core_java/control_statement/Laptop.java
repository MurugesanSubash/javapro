package core_java.control_statement;

import java.util.Scanner;

public class Laptop {
    static Scanner scan = new Scanner(System.in);

    public static void showroom() {
        System.out.println("             ");
        System.out.println("                   WELCOME TO NIVI LAPTOP SALES AND SERVICE     ");
        for(int  a = 3;(a>=1);a--){
        System.out.println("             ");
        System.out.println("<< Would you like to see our LAPTOP collections ***");
        // System.out.println("<< Do you like to purchase a laptop on us...");
        System.out.println("             ");
        System.out.println("<< Press Yes if you want to (or) No for return");
        System.out.println("             ");
        String customer_wish = scan.next();

        if(customer_wish.equalsIgnoreCase("yes")){
            System.out.println("We have below brand on it");
            System.out.println("   press 1 for Acer");
            System.out.println("   press 2 for Hp");
            System.out.println("   press 3 for dell");
            int Laptop_brand = scan.nextInt();
            // choosing brand in here by swtich
            switch (Laptop_brand) {
                case 1:
                System.out.println("We have seperate section on this");
                System.out.println("   press 1 for Gaming models");
                System.out.println("   press 2 for IT fields");
                System.out.println("   press 3 for Basic Models");

                int Laptop_model_Acer = scan.nextInt();
                
                switch (Laptop_model_Acer) {
                    case 1:
                    System.out.println("<< yes stock availalbe");
                    System.out.println("<< For Checkout Specifications  Yes / No");
                    String customer_seletion = scan.next();

                      if(customer_seletion.equalsIgnoreCase("yes")){
                           System.out.println("please select the processor");
                           System.out.println("   click 1 for itel processor");
                           System.out.println("   click 2 for Ryzen processor");
                           int Laptop_processor = scan.nextInt();
                           switch (Laptop_processor) {
                            case 1:
                                System.out.println("please choose your laptop");
                                System.out.println("   i5 11 gen Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   i7 11 gen Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   i9 11 gen Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_itel = scan.nextInt();
                                if(Laptop_Spec_itel==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_i5_prize = scan.nextInt();
                                        if(itel_i5_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_i7_prize = scan.nextInt();
                                        if(itel_i7_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_i9_prize = scan.nextInt();
                                        if(itel_i9_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            case 2:
                                System.out.println("please choose your laptop");
                                System.out.println("   Ryzen 5series 40000 Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   Ryzen 6series 20000 Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   Ryzen 6series 70000 Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_Ryzen = scan.nextInt();
                                if(Laptop_Spec_Ryzen==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_5S_prize = scan.nextInt();
                                        if(itel_5S_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}  
                                }
                                else if (Laptop_Spec_Ryzen==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_6S_prize = scan.nextInt();
                                        if(itel_6S_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_6S7_prize = scan.nextInt();
                                        if(itel_6S7_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            default:{System.out.println("YOU CHOOSE THE WRONG OPTION");}
                           }
                      }
                      else{System.out.println("....Thank You....");}
                        break;
                    case 2:
                    System.out.println("--------Sorry OUT OF STOCK---------");   
                        break;
                    case 3:
                    System.out.println("<< yes stock availalbe");
                    System.out.println("<< For Checkout Specifications  Yes / No");
                    String customer_seletion_2 = scan.next();

                      if(customer_seletion_2.equalsIgnoreCase("yes")){
                           System.out.println("please select the processor");
                           System.out.println("   click 1 for itel processor");
                           System.out.println("   click 2 for Ryzen processor");
                           int Laptop_processor = scan.nextInt();
                           switch (Laptop_processor) {
                            case 1:
                                System.out.println("please choose your laptop");
                                System.out.println("   i5 11 gen Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   i7 11 gen Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   i9 11 gen Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_itel = scan.nextInt();
                                if(Laptop_Spec_itel==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_i5_prize = scan.nextInt();
                                        if(itel_i5_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_i7_prize = scan.nextInt();
                                        if(itel_i7_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_i9_prize = scan.nextInt();
                                        if(itel_i9_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            case 2:
                                System.out.println("please choose your laptop");
                                System.out.println("   Ryzen 5series 40000 Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   Ryzen 6series 20000 Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   Ryzen 6series 70000 Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_Ryzen = scan.nextInt();
                                if(Laptop_Spec_Ryzen==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_5S_prize = scan.nextInt();
                                        if(itel_5S_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_6S_prize = scan.nextInt();
                                        if(itel_6S_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_6S7_prize = scan.nextInt();
                                        if(itel_6S7_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            default:{System.out.println("YOU CHOOSE THE WRONG OPTION");}
                           }
                      }
                      else{System.out.println("....Thank You....");}
                        break;
                    default: {System.out.println("YOU CHOOSE THE WRONG OPTION");}     
                }   
                    break;
                case 2:
                System.out.println("We have seperate section on this");
                System.out.println("   press 1 for Gaming models");
                System.out.println("   press 2 for IT fields");
                System.out.println("   press 3 for Basic Models");

                int Laptop_model_HP = scan.nextInt();
                
                switch (Laptop_model_HP) {
                    case 1:
                    System.out.println("<< yes stock availalbe");
                    System.out.println("<< For Checkout Specifications  Yes / No");
                    String customer_seletion = scan.next();

                      if(customer_seletion.equalsIgnoreCase("yes")){
                           System.out.println("please select the processor");
                           System.out.println("   click 1 for itel processor");
                           System.out.println("   click 2 for Ryzen processor");
                           int Laptop_processor = scan.nextInt();
                           switch (Laptop_processor) {
                            case 1:
                                System.out.println("please choose your laptop");
                                System.out.println("   i5 11 gen Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   i7 11 gen Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   i9 11 gen Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_itel = scan.nextInt();
                                if(Laptop_Spec_itel==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_i5_prize = scan.nextInt();
                                        if(itel_i5_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_i7_prize = scan.nextInt();
                                        if(itel_i7_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_i9_prize = scan.nextInt();
                                        if(itel_i9_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            case 2:
                                System.out.println("please choose your laptop");
                                System.out.println("   Ryzen 5series 40000 Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   Ryzen 6series 20000 Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   Ryzen 6series 70000 Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_Ryzen = scan.nextInt();
                                if(Laptop_Spec_Ryzen==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_5S_prize = scan.nextInt();
                                        if(itel_5S_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_6S_prize = scan.nextInt();
                                        if(itel_6S_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_6S7_prize = scan.nextInt();
                                        if(itel_6S7_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            default:{System.out.println("YOU CHOOSE THE WRONG OPTION");}
                           }
                      }
                      else{System.out.println("....Thank You....");}
                        break;
                    case 2:
                    System.out.println("Sorry OUT OF STOCK");   
                        break;
                    case 3:
                    System.out.println("<< yes stock availalbe");
                    System.out.println("<< For Checkout Specifications  Yes / No");
                    String customer_seletion_2 = scan.next();

                      if(customer_seletion_2.equalsIgnoreCase("yes")){
                           System.out.println("please select the processor");
                           System.out.println("   click 1 for itel processor");
                           System.out.println("   click 2 for Ryzen processor");
                           int Laptop_processor = scan.nextInt();
                           switch (Laptop_processor) {
                            case 1:
                                System.out.println("please choose your laptop");
                                System.out.println("   i5 11 gen Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   i7 11 gen Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   i9 11 gen Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_itel = scan.nextInt();
                                if(Laptop_Spec_itel==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_i5_prize = scan.nextInt();
                                        if(itel_i5_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_i7_prize = scan.nextInt();
                                        if(itel_i7_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_i9_prize = scan.nextInt();
                                        if(itel_i9_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            case 2:
                                System.out.println("please choose your laptop");
                                System.out.println("   Ryzen 5series 40000 Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   Ryzen 6series 20000 Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   Ryzen 6series 70000 Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_Ryzen = scan.nextInt();
                                if(Laptop_Spec_Ryzen==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_5S_prize = scan.nextInt();
                                        if(itel_5S_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_6S_prize = scan.nextInt();
                                        if(itel_6S_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_6S7_prize = scan.nextInt();
                                        if(itel_6S7_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            default:{System.out.println("YOU CHOOSE THE WRONG OPTION");}
                           }
                      }
                      else{System.out.println("....Thank You....");}
                        break;
                    default: {System.out.println("YOU CHOOSE THE WRONG OPTION");}     
                }   
                    break;
                case 3:
                System.out.println("We have seperate section on this");
                System.out.println("   press 1 for Gaming models");
                System.out.println("   press 2 for IT fields");
                System.out.println("   press 3 for Basic Models");

                int Laptop_model_Dell = scan.nextInt();
                
                switch (Laptop_model_Dell) {
                    case 1:
                    System.out.println("<< yes stock availalbe");
                    System.out.println("<< For Checkout Specifications  Yes / No");
                    String customer_seletion = scan.next();

                      if(customer_seletion.equalsIgnoreCase("yes")){
                           System.out.println("please select the processor");
                           System.out.println("   click 1 for itel processor");
                           System.out.println("   click 2 for Ryzen processor");
                           int Laptop_processor = scan.nextInt();
                           switch (Laptop_processor) {
                            case 1:
                                System.out.println("please choose your laptop");
                                System.out.println("   i5 11 gen Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   i7 11 gen Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   i9 11 gen Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_itel = scan.nextInt();
                                if(Laptop_Spec_itel==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_i5_prize = scan.nextInt();
                                        if(itel_i5_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_i7_prize = scan.nextInt();
                                        if(itel_i7_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_i9_prize = scan.nextInt();
                                        if(itel_i9_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            case 2:
                                System.out.println("please choose your laptop");
                                System.out.println("   Ryzen 5series 40000 Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   Ryzen 6series 20000 Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   Ryzen 6series 70000 Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_Ryzen = scan.nextInt();
                                if(Laptop_Spec_Ryzen==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_5S_prize = scan.nextInt();
                                        if(itel_5S_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_6S_prize = scan.nextInt();
                                        if(itel_6S_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_6S7_prize = scan.nextInt();
                                        if(itel_6S7_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            default:{System.out.println("YOU CHOOSE THE WRONG OPTION");}
                           }
                      }
                      else{System.out.println("....Thank You....");}
                        break;
                    case 2:
                    System.out.println("Sorry OUT OF STOCK");   
                        break;
                    case 3:
                    System.out.println("<< yes stock availalbe");
                    System.out.println("<< For Checkout Specifications  Yes / No");
                    String customer_seletion_2 = scan.next();

                      if(customer_seletion_2.equalsIgnoreCase("yes")){
                           System.out.println("please select the processor");
                           System.out.println("   click 1 for itel processor");
                           System.out.println("   click 2 for Ryzen processor");
                           int Laptop_processor = scan.nextInt();
                           switch (Laptop_processor) {
                            case 1:
                                System.out.println("please choose your laptop");
                                System.out.println("   i5 11 gen Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   i7 11 gen Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   i9 11 gen Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_itel = scan.nextInt();
                                if(Laptop_Spec_itel==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_i5_prize = scan.nextInt();
                                        if(itel_i5_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_i7_prize = scan.nextInt();
                                        if(itel_i7_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_itel==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_i9_prize = scan.nextInt();
                                        if(itel_i9_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            case 2:
                                System.out.println("please choose your laptop");
                                System.out.println("   Ryzen 5series 40000 Ram 8GB / SSD 512 for - 5,20,000 Rs - press 1");
                                System.out.println("   Ryzen 6series 20000 Ram 16GB / SSD 512 for - 8,30,000 Rs - press 2");
                                System.out.println("   Ryzen 6series 70000 Ram 16GB / SSD 512 / 4GB graphics for - 10,30,000 Rs - press 3");
                                int Laptop_Spec_Ryzen = scan.nextInt();
                                if(Laptop_Spec_Ryzen==1){
                                        System.out.println("you need to pay 520000 Rs");
                                        int itel_5S_prize = scan.nextInt();
                                        if(itel_5S_prize ==520000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==2){
                                        System.out.println("you need to pay 830000 Rs");
                                        int itel_6S_prize = scan.nextInt();
                                        if(itel_6S_prize ==830000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                else if (Laptop_Spec_Ryzen==3){
                                        System.out.println("you need to pay 1030000 Rs");
                                        int itel_6S7_prize = scan.nextInt();
                                        if(itel_6S7_prize ==1030000){
                                            System.out.println("Your order has successfully register");
                                        }
                                        else{System.out.println("Payment failed ..., Sorry try again");}
                                }
                                break;
                            default: {System.out.println("YOU CHOOSE THE WRONG OPTION");}                          
                           }
                      }
                      else{System.out.println("....Thank You....");}
                        break;
                    default: {System.out.println("YOU CHOOSE THE WRONG OPTION");}     
                }   
                    break;
                default:  {System.out.println("YOU CHOOSE THE WRONG OPTION");}       
            }
        }
        else{System.out.println("Try again .....    <<<< THANK YOU >>>>");}
    }
    }
    public static void main(String[] args) {
        // Laptop paper = new Laptop();
        showroom();
    }
}
