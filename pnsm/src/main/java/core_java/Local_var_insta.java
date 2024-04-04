package core_java;

public class Local_var_insta {


    public static void main (String args[])
    {

     Local_var_insta Obj2 = new Local_var_insta();

     int myage = Obj2.Method2();

     char number = (char)myage;

     System.out.println(number);

      Obj2.methods3();


    }

    public int Method2()
    {

        int age = 23;

        return age;
    }

    public void methods3()
    {
        int G = 55;
        System.out.println(G);
        
    }
    
}
