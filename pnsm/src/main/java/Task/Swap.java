package Task;

public class Swap {

    public static void main(String[] args) {
         int a=1;
         int b=2;
          a = a+b; // a = 1+2 = 3
          b = a-b; // b = 3-2 = 1
          a = a-b; // a = 3-1=2
          System.out.println("a value is "+a + " b value is "+b);
    }
}