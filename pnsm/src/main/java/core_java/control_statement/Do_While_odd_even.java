package core_java.control_statement;

public class Do_While_odd_even {

    public static void main(String[] args) {
       
         int i = 1;
        do {
            if(i % 2!=0){
                System.out.println("this is odd num "+i);
            }
              else{
                System.out.println("\nthis is even num "+i);
              }
              i++;
        }while(i<=100);
    } 
}


