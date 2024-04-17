package Classes;

public class Polymorphism {

    public void Sample(int age){
       System.out.println("Her age is "+age);
    }
    public void Sample(String name){
   System.out.println("Her name is "+name);
    }
    public void Sample(float height){
    System.out.println("she is "+height+"cm tall");
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism(); 
        obj.Sample("Nivi");
        obj.Sample(1.68f);
        obj.Sample(26);
    }
}