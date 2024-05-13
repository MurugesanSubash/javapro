package Task;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamAPI {

    public static void main(String[] args) {
        
        int [] woods = {11,5,1,8,9,10};

    //     IntStream woods1 = Arrays.stream(woods);
    //    IntStream S =woods1.sorted();
    //    S.forEach(b->System.out.println(b));

    //    System.out.println("Another method");

    //    Arrays.stream(woods).sorted().forEach(System.out::println);
    //    System.out.println("Using max methods");
    //    System.out.println(Arrays.stream(woods).max());
          System.out.println(Arrays.stream(woods).min());
       
    
          
       OptionalInt DD = Arrays.stream(woods).max();
       System.out.println(DD.getAsInt());
    }
    
}
