package core_java.control_statement;

import java.util.Scanner;

public class tables {
static Scanner scan = new Scanner(System.in);
    public void Demowhile(){
        System.out.println("Which multiple table you want?");
        int b = scan.nextInt();
        short a=1;
        while (10>=a){
            // System.out.println(a+"*\t"+b+" =\t " +a*b);
            System.out.println(a+"x"+b+"="+a*b);
            a++;
        }
    }
    public static void main(String[] args) {
        tables obj = new tables();
        obj.Demowhile();
    }
}
