package core_java;

public class with_args_and_par {

    
    public char example(int age, String name)
    {

        int value = age ;

        System.out.println("my age is :"+value);

        System.out.println("my name is :"+ name);

        char T = (char) age;

        return T;
    }


    public static void main (String args[])
    {


        with_args_and_par obj8 = new with_args_and_par();
       

        char A = obj8.example(55,"Nivi");

        System.out.println("char value is :"+A);
         
         
        
    }
    
}
