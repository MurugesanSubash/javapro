package Task;

public class Reverse_String {

    public static void main(String[] args) {
        
        String name = "Nivi", N ="";
        int D = name.length();
        System.out.println(D);
    
        for (int i=0;i<D;i++){

         char F = name.charAt(i);
         N = F+N;
         if(i==(D-1)){
            System.out.println(N);
       }
    }
}
    
}
