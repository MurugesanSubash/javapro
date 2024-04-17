package Inheritance.Hybrid;

public class HybridMain extends Single_Inheritance implements Interface_Inheritance {
     
    public static void main(String[] args) {
        
        HybridMain obj = new HybridMain();
        obj.Place_to_use();
        obj.Number_place_need();
    }
    public void Place_to_use() {
        System.out.println("<< ");
    }
    
}
