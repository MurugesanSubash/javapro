package core_java;

import java.util.Scanner;

public class Two {
    public void Mytask(float a,int b,char c,double d)
    {
     
     System.out.println("My float vaue is "+a); 
     System.out.println("My int vaue is "+b);
     System.out.println("My double vaue is "+c);
     System.out.println("My double vaue is "+d);
    
    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);

        Two obj=new Two();
        
        System.out.println("what is your flaot");
        System.out.println("what is your int");
        System.out.println("what is your char");
        System.out.println("what is your double");
        
        obj.Mytask(sc.nextFloat(),sc.nextInt() ,sc.next().charAt(0) , sc.nextDouble());
     
       
       



    }
}
