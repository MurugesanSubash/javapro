package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class list {

    public static void main(String[] args) {
        
        LinkedList LL = new LinkedList<>();

        LL.add("LL");
        LL.add("LL");
        System.out.println(LL);

        Stack SL = new Stack<>();

        SL.push("SL");
        SL.push("AAA");
        SL.push("BBB");
        System.out.println(SL);
        SL.pop();
        System.out.println(SL);
        System.out.println(SL.peek());


        Vector VL = new Vector<>();
        VL.add("VL");
        System.out.println(VL);

        ArrayList AL = new ArrayList<>();
        AL.add("AL");
        System.out.println(AL);

        AL.addAll(VL);
        System.out.println(AL);

    }
    
}
