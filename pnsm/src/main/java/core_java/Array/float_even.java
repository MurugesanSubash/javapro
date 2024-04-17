package core_java.Array;

public class float_even {
    public static void main(String[] args) {
        float [] values = {5.2f,3.1f,9.3f,5.6f,4.1f,8.9f,5.1f,6.2f,3.7f,7.7f};
        int i = 0;
        for(;i<values.length;i++){
            int don = (int) values[i];
            if (don%2==0){
                System.out.println("This is even number"+values[i]);
            }
            if (don%2!=0){
                System.out.println("This is odd number"+values[i]);
            }
        }
    }
}
