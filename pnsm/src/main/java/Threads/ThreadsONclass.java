package Threads;

public class ThreadsONclass {

    ThreadsONclass(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) throws InterruptedException {
    ThreadsONclass ddd =  new ThreadsONclass();
     InnerThreadsONclass IN = new InnerThreadsONclass();
     IN.start();
     
    InnerThreadsONclass_1 IN1 = new InnerThreadsONclass_1();
    Thread  Th = new Thread(IN1);
    Th.start();

    InnerThreadsONclass_2 obj = new InnerThreadsONclass_2();
    Thread ths = new Thread(){
        public void run(){
        obj.ohhh();
        }
    };
    ths.start();
    }

}

class InnerThreadsONclass extends Thread {
  
    public void run(){
        System.out.println("this is normal class ");
        System.out.println("this is normal class1 ");
    }
}
 
class InnerThreadsONclass_1 implements Runnable {

   public void run (){
        for(int i =0;i<2;i++){
            System.out.println("This is using runnable ");
        }
    }
}

class InnerThreadsONclass_2 {
  
    public void ohhh(){
        System.out.println("ASDFGHJKLKMZXCVBNM");
    }
    
}