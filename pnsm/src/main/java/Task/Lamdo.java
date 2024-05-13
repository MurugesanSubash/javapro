package Task;

public class Lamdo {

    public static void main(String[] args) 
    {
        InnerLamdo get =(x,y)->{return x+y ;};
        System.out.println(get.Add(2, 1)); 
        Lamdo obj = new Lamdo();
        
    }

public void Divide (int c , int b){
}
}

@FunctionalInterface
interface InnerLamdo {

public  int Add(int a,int b);

public static void sub (int a,int v){

    System.out.println(v-a);

}

}