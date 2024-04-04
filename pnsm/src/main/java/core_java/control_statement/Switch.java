package core_java.control_statement;

import java.util.Scanner;

public class Switch {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("enter the value in between 0 - 5");
        int values = scan.nextInt();
        Switch1(values);
    }
    public static void Switch1(int values){
// switch worked based on values==== not condition
        switch (values) {
            case 0:
                System.out.println("its zero");
                break;
            case 1:
                System.out.println("its one");
                break;
            case 2:
                System.out.println("its two");
                break;
            case 3:
                System.out.println("its three");
                break;
            case 4:
                System.out.println("its four");
                break;
            case 5:
                System.out.println("its five");
                break;        
            default:
            System.out.println("Sorry");
            
        }
    }
    
}
