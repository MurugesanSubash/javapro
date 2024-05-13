package Task;

import java.util.function.Predicate;

public class Functional_Predicate {

    public static void main(String[] args) {
        Predicate<Integer> pd = (d)->d!=1;
        System.out.println(pd.test(0));

        Predicate <String> pd = (x)-> x.equalsIgnoreCase("yes");
        System.out.println(pd.);
    } 
}