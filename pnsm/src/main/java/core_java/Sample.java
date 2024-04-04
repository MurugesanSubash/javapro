package core_java;

public class Sample {

    public static void main (String args[])

    {

       Sample obj1 = new Sample();

       String panName = "Nivi";
       int panAge = 21;
       String date_of_Birth = "27.01.2003";
       long Mobilenumber = 9500609922l;
       String Address= "Nammakal";
       float Salary = 11.55f;

       System.out.println("--------Details need to apply PAN CARD---------");
       
       System.out.println("Pan card name is :"+panName +"\n salary of the person :"+Salary+"\n Age of person :"+panAge +"\t Mobile number of the person :"+Mobilenumber+
       "\t Date of birth of the person :"+date_of_Birth +"\n Native of the person :"+Address);

       int a=88;

       float b = a;

       System.out.println(b);


       float c = 77.82f;

       short d = (short)c;

       System.out.println(d);

       obj1.flower();

       flower1();

       char h = 'A';

       char O = 'a';

       int Y = (int)h;

       int U = (int)O;

       System.out.println(Y);
       System.out.println(U);

       int L = 65;

       char T = (char) L;

       System.out.println(T);

    }

    public void flower ()
    {
        System.out.println("this normal methods");
    }

    public static void flower1 ()
    {
        System.out.println("this using static methods");
    }
    
}
